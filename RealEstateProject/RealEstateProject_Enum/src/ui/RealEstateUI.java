package ui;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import service.RealEstateService;
import service.RealEstateServiceImpl;
import vo.BuyingAndSelling;
import vo.Charter;
import vo.MonthlyRent;
import vo.RealEstate;
import vo.RealEstateType;

public class RealEstateUI {
	Scanner keyin = new Scanner(System.in);
	RealEstateService service = new RealEstateServiceImpl();

	public RealEstateUI() {
		while(true) {
			mainMenu();
			String choice;

			choice = keyin.next();   keyin.nextLine();

			switch(choice) {
			case "1" : regist();   		break;  // 등록
			case "2" : retrieve(); 		break;	// 검색
			case "3" : modify();   		break;	// 수정
			case "4" : delete();   		break;	// 삭제
			case "5" : retrieveAll();  	break;	// 전체출력	
			case "0" : 
				System.out.println("** 프로그램을 종료합니다.");
				return;
			default :
				System.out.println("** 메뉴를 다시 선택해주세요");
			}
		}
	}

	// 등록
	private void regist() {
		String choice;
		registMenu();

		choice = keyin.next();
		
		keyin.nextLine();
		
		switch(choice) {
		case "1" : 
			input(RealEstateType.BuyingAndSelling);	// 매매 등록(주소, 주거형태, 크기, 매매가격)
			break;
		case "2" : 				
			input(RealEstateType.Charter);				// 전세 등록
			break;
		case "3" : 				
			input(RealEstateType.MonthlyRent);			// 월세 등록
			break;

		case "0" : return; // 상위 메뉴
		default : System.out.println("** 메뉴를 다시 선택해주세요");			
		}
	}

	// 매물 정보의 데이터 중 중복데이터 입력
	private void input(RealEstateType type) {
		String address;			// 주소
		String houseType;		// 주거형태
		int size;				// 크기
		int price;				// 월세, 전세, 매매가격
		RealEstate realEstate = null;

		System.out.print("> 주소 입력: ");
		address = keyin.nextLine();		// 엔터키도 데이터로 처리
		System.out.print("> 주거 형태(아파트, 빌라, 단독주택): ");
		houseType = keyin.next();
		System.out.print("> 크기(평형): ");
		size = keyin.nextInt();

		switch(type) {
		case BuyingAndSelling:
			System.out.print("> 매매 가격: ");
			price = keyin.nextInt();
			realEstate = new BuyingAndSelling(address, houseType, size, price);
			break;
		case Charter : 
			System.out.print("> 전세 가격: ");
			price = keyin.nextInt();
			realEstate = new Charter(address, houseType, size, price);
			break;
		case MonthlyRent:
			System.out.print("> 월세 가격: ");
			price = keyin.nextInt();
			realEstate = new MonthlyRent(address, houseType, size, price);
		}
		boolean result = service.insert(realEstate);

		if(result) {
			System.out.println("** 물건이 등록되었습니다.");
			return;
		}
		System.out.println("** 물건 등록 실패!");
	}

	private void retrieve() {
		retrieveMenu();
		
		String choice, address;
		List<RealEstate> list = null;
		RealEstateType type ;
		
		choice = keyin.next();  keyin.nextLine(); 

		switch(choice) {
		case "1" : {
			System.out.println("> 검색할 주소 입력: ");
			address = keyin.nextLine();
			RealEstate realEstate = service.selectByAddress(address);
			System.out.println(realEstate);
		}	
		return;
		case "2" : 
			type = RealEstateType.BuyingAndSelling;
			break;
		case "3" : 
			type = RealEstateType.Charter;
			break;
		case "4" : 
			type = RealEstateType.MonthlyRent;
			break;
		default :
			System.out.println("** 메뉴 선택을 다시~");
			return;
		}

		list = service.selectByType(type);
		if(list.size() == 0) {
			System.out.println("** 찾는 물건이 없습니다.");
			return;
		}
		
		Iterator<RealEstate> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	private void modify() {
		String address;

		System.out.println("> 수정 물건의 주소: ");
		address = keyin.nextLine();

		RealEstate realEstate = service.selectByAddress(address);
		if (realEstate == null) {
			System.out.println("** 해당 주소의 물건은 없습니다.");
			return;
		}

		System.out.println("*** 등록된 정보");
		System.out.println(realEstate);

		int price; 

		if(realEstate instanceof BuyingAndSelling) {
			System.out.print("> 매매가격: ");
			price = keyin.nextInt();
			((BuyingAndSelling)realEstate).setPrice(price);
		}
		else if(realEstate instanceof Charter) {
			System.out.print("> 전세 임대 보증금: ");
			price = keyin.nextInt();
			((Charter)realEstate).setDepositMoney(price);
		}
		else if(realEstate instanceof MonthlyRent) {
			System.out.print("> 월 임대료: ");
			price = keyin.nextInt();
			((MonthlyRent)realEstate).setMonthlyRent(price);
		}
		boolean result = service.update(realEstate);

		if(result) {
			System.out.println("** 수정이 완료되었습니다.");
			return;
		}
		System.out.println("** 수정 실패!");
	}

	// 거래 완료 물건 삭제
	private void delete() {
		String address;

		System.out.println("> 삭제 물건의 주소: ");
		address = keyin.nextLine();

		boolean result = service.delete(address);

		if(result) System.out.println("** 정상 삭제되었습니다.");
		else       System.out.println("** 삭제 실패");
	}

	// 전체 데이터 출력
	private void retrieveAll() {
		List<RealEstate> list = service.selectAll();

		if(list.size() == 0) {
			System.out.println("** 등록된 물건이 없습니다.");
			return;
		}

		Iterator<RealEstate> iter = list.iterator();

		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	// 메인 메뉴
	private void mainMenu() {
		System.out.println("\n-----------------------------");
		System.out.println("   부동산 중계 관리 시스템");
		System.out.println("-----------------------------");
		System.out.println("        1. 등    록");
		System.out.println("        2. 검    색");
		System.out.println("        3. 수    정");
		System.out.println("        4. 삭제(거래완료)");
		System.out.println("        5. 전체출력");
		System.out.println("        0. 종    료");
		System.out.println("-----------------------------");
		System.out.print  ("        메뉴선택 > ");
	}

	// 등록 메뉴
	private void registMenu() {
		System.out.println("\n-----------------------------");
		System.out.println("    부동산 매물 정보 등록");
		System.out.println("-----------------------------");
		System.out.println("        1. 매    매");
		System.out.println("        2. 전    세");
		System.out.println("        3. 월    세");
		System.out.println("        0. 상위메뉴");
		System.out.println("-----------------------------");
		System.out.print  ("        메뉴선택 > ");		
	}

	// 검색 메뉴
	private void retrieveMenu() {
		System.out.println("\n-----------------------------");
		System.out.println("    부동산 매물 정보 검색");
		System.out.println("-----------------------------");
		System.out.println("       1. 주소로 검색");
		System.out.println("       2. 매매 물건 검색");
		System.out.println("       3. 전세 물건 검색");
		System.out.println("       4. 월세 물건 검색");
		System.out.println("-----------------------------");
		System.out.print  ("        메뉴선택 > ");		
	}
}
