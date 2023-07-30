package service;

import java.util.Scanner;

import vo.Fitness;

public class FitnessServiceImpl implements FitnessService {
	Scanner keyin = new Scanner(System.in);
	Fitness[] fitness = new Fitness[50];
	int count = 0;
	
	public FitnessServiceImpl() {
		String choice;
		
		while(true) {
			menu();
			choice = keyin.next();
			
			switch(choice) {
			case "1" : insert(); break;
			case "2" : read(); break;
			case "3" : update(); break;
			case "4" : delete() ; break;
			case "5" : selectAll(); break;
			case "0" : 
				System.out.println("** 프로그램을 종료합니다.");
				keyin.close();
				return;
			default:
				System.out.println("err> 메뉴를 다시 선택해주세요");
			}
		}
	}
	
	@Override
	public boolean insert() {
		System.out.println("\n[ 회원 가입 ]");
		
		String id;
		String name;
		double height;
		double weight;
		
		System.out.print("* 아이디: ");
		id = keyin.next();
		
		// 아이디 중복체크
		for(int i=0; i<count; ++i) {
			 if(fitness[i].getId().equals(id)) {
				 System.out.println("err> 중복된 아이디가 있습니다.");
				 return false;
			 }
		}
		
		System.out.print("* 이 름: ");
		name = keyin.next();
		
		System.out.print("* 키(cm): ");
		height = keyin.nextDouble();
		
		System.out.print("* 몸무게(Kg): ");
		weight = keyin.nextDouble();
		
		fitness[count] = new Fitness(id, name, height, weight);
		++count;
		
		System.out.println("** 회원가입이 완료되었습니다.");
		return true;
	}

	@Override
	public void read() {
		System.out.println("\n[ 회원 조회 ]");
		
		String id;
		System.out.print("* 아이디: ");
		id = keyin.next();
		
		for(int i=0; i<count; ++i) {
			if(fitness[i].getId().equals(id)) {
				System.out.println(fitness[i]);
				return;
			}
		}
		
		System.out.println("** 입력한 ID의 회원이 없습니다.");
	}

	@Override
	public boolean update() {
		System.out.println("\n[ 정보 수정 ]");
		
		String id;
		double height;
		double weight;
		int position = -1;
		
		System.out.print("* 아이디: ");
		id = keyin.next();
		
		for(int i=0; i<count; ++i) {
			if(fitness[i].getId().equals(id)) {
				position = i;
				break;
			}
		}
		
		if(position == -1) {
			System.out.println("** 입력한 아이디의 회원이 없습니다.");
			return false;
		}
		
		System.out.print("* 키(cm): ");
		height = keyin.nextDouble();
		
		System.out.print("* 몸무게(Kg): ");
		weight = keyin.nextDouble();
		
		fitness[position].setWeight(weight);
		fitness[position].setHeight(height);
		
		System.out.println("** 회원의 정보가 수정되었습니다.");		
				
		return true;
	}

	@Override
	public boolean delete() {
		System.out.println("\n[ 회원 탈퇴 ]");
		String id;
		
		System.out.print("* 아이디: ");
		id = keyin.next();
		
		for(int i=0; i<count; ++i) {
			if(fitness[i].getId().equals(id)) {
				for(int j=i; j<count-1; ++j) {
					fitness[j] = fitness[j+1];
				}
				System.out.println("** 회원 탈퇴가 완료되었습니다.");
				--count;
				return true;
			}
		}
		
		System.out.println("** 입력하신 회원이 없습니다.");
		
		return false;
	}

	@Override
	public void selectAll() {
		System.out.println("\n[ 전체 조회 ]");
		
		if(count == 0 ) {
			System.out.println("** 가입한 회원이 한 명도 없습니다.");
			return ;
		}
		
		for(int i=0; i<count; ++i) {
			System.out.println(fitness[i]);
		}

	}
	public void menu() {
		System.out.println("===[XX 센터 회원관리]===");
		System.out.println("    1) 회원 가입");
		System.out.println("    2) 정보 조회");
		System.out.println("    3) 정보 수정");
		System.out.println("    4) 탈     퇴");
		System.out.println("    5) 전체 조회");
		System.out.println("    0) 종     료");
		System.out.println("========================");
		System.out.print  ("        선택 > ");
	}

}
