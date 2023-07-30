package master.ui;

import java.util.Scanner;

import master.service.ScoreService;
import master.service.ScoreServiceImpl;
import master.vo.Student;

public class ScoreUI {
	Scanner keyin = new Scanner(System.in);
	ScoreService service = new ScoreServiceImpl();

	public ScoreUI() {
		String choice;
		
		while(true) {
			menu();
			choice = keyin.next();

			switch(choice) {
			case "1" : regist();  	 break;		// 성적등록
			case "2" : retrive(); 	 break;		// 성적조회
			case "3" : retriveAll(); break;		// 전체성적등록
			case "4" : delete(); 	 break;		// 성적삭제
			case "5" : modify(); 	 break;		// 성적수정
			case "6" : scoreAnaly(); break;		// 성적통계조회
			case "0" : 
				System.out.println("** 프로그램을 종료합니다.");
				return;
			default :
				System.out.println("** 메뉴를 다시 선택해주세요");
			}
		}
	}
	// 학생 성적 등록
	private void regist() {
		System.out.println("\n>>>>>> [성적 등록] <<<<<<");
		String stdid, stdname;
		double it, language, basic;
		
		System.out.print("- 학번: ");
		stdid = keyin.next();
		
		Student s = service.selectOne(stdid);
		if(s != null) {
			System.out.println("** 성적이 이미 등록되어 있습니다.\n");
			return;
		}
		System.out.print("- 이름: ");
		stdname = keyin.next();
		
		System.out.print("- IT: ");
		it = keyin.nextDouble();
		
		System.out.print("- 외국어: ");
		language = keyin.nextDouble();

		System.out.print("- 베이직: ");
		basic = keyin.nextDouble();
		
		// 등록 실시
		boolean result = service.insert(new Student(stdid, stdname, it, language, basic));
		if(result) {
			System.out.println("** 성적이 등록되었습니다.\n");
			return;
		}
		System.out.println("** 성적 등록 실패\n");
	}

	// 성적 조회
	private void retrive() {
		System.out.println("\n>>>>>> [성적 조회(학번)] <<<<<<");
		String stdid;
		
		System.out.print("- 학번: ");
		stdid = keyin.next();
		
		Student s = service.selectOne(stdid);
		if(s == null) {
			System.out.println("** 등록된 성적이 없습니다.\n");
			return;
		}
		
		System.out.println(s);
	}

	private void retriveAll() {
		System.out.println("\n>>>>>> [전체 성적 조회] <<<<<<");

		int count = service.getCount();
		if(count <= 0 ) {
			System.out.println("** 등록된 성적이 하나도 없습니다.\n");
			return;
		}
		Student[] list = service.selectAll();
		
		for(int i=0; i<count; ++i)
			System.out.println(list[i]);
	}
	
	// 성적 삭제
	private void delete() {
		System.out.println("\n>>>>>> [성적 삭제] <<<<<<");
		String stdid;
		String answer;
		
		System.out.print("- 학번: ");
		stdid = keyin.next();
		
		Student s = service.selectOne(stdid);
		if(s == null) {
			System.out.println("** 등록된 성적이 없습니다.\n");
			return;
		}
		
		System.out.println(s);
		
		System.out.print(">> 위 학생의 성적을 삭제하시겠습니까? (y/n) ");
		answer = keyin.next();
		
		if(!answer.equals("y")) {
			System.out.println("** 삭제작업이 취소되었습니다.\n");
			return;
		}
		boolean result = service.delete(stdid);
		System.out.println(service.getCount() + " " + result);
		
		if(result) {
			System.out.println("** 삭제 성공\n");
			return;
		}
		System.out.println("** 삭제 실패. 잠시 후 다시 실행해주세요\n");
	}

	// 성적 수정
	private void modify() {
		System.out.println("\n>>>>>> [성적 수정] <<<<<<");
		String stdid;
		double it, language, basic;
		
		System.out.print("- 학번: ");
		stdid = keyin.next();
		
		Student s = service.selectOne(stdid);
		if(s == null) {
			System.out.println("** 등록된 성적이 없습니다.\n");
			return;
		}
	
		System.out.println("\n** 현재 성적 **");
		System.out.println(s);
		
		System.out.print("- IT: ");
		it = keyin.nextDouble();
		
		System.out.print("- 외국어: ");
		language = keyin.nextDouble();

		System.out.print("- 베이직: ");
		basic = keyin.nextDouble();
		
		// 등록 실시
		boolean result = service.update(new Student(s.getStdid(), s.getStdname(), it, language, basic));
		if(result) {
			System.out.println("** 성적이 수정되었습니다.\n");
			return;
		}
		System.out.println("** 수정 실패. 잠시 후 다시 실행해주세요.\n");		
	}

	// 과목별 평균 조회
	private void scoreAnaly() {
		System.out.println("\n>>>>>> [과목 별 평균 조회] <<<<<<");
		int count = service.getCount();
		if(count <= 0 ) {
			System.out.println("** 등록된 성적이 하나도 없습니다.");
			return;
		}
		double[] data = service.scoreAnaly();
		
		System.out.println("*** 총 학생 수 (" + count + ")");
		System.out.printf("> IT 총 평균: %.2f%n", data[0]);
		System.out.printf("> Language 총 평균: %.2f%n", data[1]);
		System.out.printf("> Basic 총 평균: %.2f%n%n", data[2]);
	}

	private void menu() {
		System.out.println("=== [ Master 성적 관리 ] ===");
		System.out.println("     1. 성적 등록");
		System.out.println("     2. 성적 조회(학번)");
		System.out.println("     3. 전체 성적 조회");
		System.out.println("     4. 성적 삭제");
		System.out.println("     5. 성적 수정");
		System.out.println("     6. 과목 별 평균 조회");
		System.out.println("     0. 종  료");
		System.out.println("===========================");
		System.out.print  ("       > 선택 : ");
	}
}
