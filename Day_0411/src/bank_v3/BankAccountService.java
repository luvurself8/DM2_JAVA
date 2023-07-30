package bank_v3;

import java.util.Scanner;

public class BankAccountService {
	Scanner keyin = new Scanner(System.in);
	BankAccount[] bank = new BankAccount[5];  // 최대 5명가지 입력받을 수 있음
	int count = 0;

	public BankAccountService() {
		String choice;

		while(true) {
			menu();
			choice = keyin.next();
			switch(choice) {
			case "1" : create();   break;                     
			case "2" : deposit();  break;
			case "3" : withdraw(); break;
			case "4" : retrive();  break;
			case "5" : output();   break;
			case "0" : 
				System.out.println("** 프로그램을 종료합니다.");
				return;
			default : System.out.println("> 오류 : 메뉴를 다시 선택하시오\n");

			}
		}
	}
	/**
	 * 계좌 조회
	 */
	private void retrive() {
		System.out.println("\n[ 계좌 조회 ]");
		String accountNo;   // 조회할 계좌번호

		// 조회할 계좌번호를 입력 받는다.
		System.out.print("* 계좌번호: "); 
		accountNo = keyin.next();

		for(int i=0; i < count; ++i) {
			if(bank[i].getAccountNo().equals(accountNo)) {
				bank[i].output(); 
				return;
			}
		}
		
		System.out.println("> 계좌번호가 없습니다.");
	}
	/**
	 * 출금
	 */
	private void withdraw() {
		System.out.println("\n[ 출 금 ]");
		String accountNo;   // 출금할 계좌번호
		int money;			// 출금할 금액
		int position = -1;  // 찾은 계좌번호의 위치. -1이면 계좌를 못찾은걸로!

		// 출금할 계좌번호를 입력 받는다.
		System.out.print("* 계좌번호: "); 
		accountNo = keyin.next();

		for(int i=0; i < count; ++i) {
			BankAccount temp = bank[i];
			
			if(temp.getAccountNo().equals(accountNo)) {
				position = i; // 찾은 계좌의 위치를 저장
				break;
			}
		}
		// position은 계좌번호를 찾은 위치값
		if(position == -1) {
			System.out.println("> 계좌번호가 잘못되었습니다.");
			return;
		}
		
		// 금액을 입력받아서 인출을 한다.
		System.out.print("** 얼마를 출금하시겠습니까?");
		money = keyin.nextInt(); //
		
		int result = bank[position].withdraw(money);
		if(result == 0) {
			System.out.println("> 잔액이 부족합니다.");
			return;
		}
		System.out.println("** 출금 완료");
		System.out.println("** 잔액: " + bank[position].getBalance());
	}
	
	/**
	 * 입금
	 */
	private void deposit() {
		System.out.println("\n[ 입 금 ]");
		String accountNo;   // 입금할 계좌번호
		int money;			// 입금할 금액
		int position = -1;  // 찾은 계좌번호의 위치. -1이면 계좌를 못찾은걸로!

		// 입금할 계좌번호를 입력 받는다.
		System.out.print("* 계좌번호: "); 
		accountNo = keyin.next();

		for(int i=0; i < count; ++i) {
			BankAccount temp = bank[i];
			
			if(temp.getAccountNo().equals(accountNo)) {
				position = i; // 찾은 계좌의 위치를 저장
				break;
			}
		}
		// position은 계좌번호를 찾은 위치값
		if(position == -1) {
			System.out.println("> 계좌번호가 잘못되었습니다.");
			return;
		}
		
		// 금액을 입력받아서 저축을 한다.
		System.out.print("** 얼마를 입금하시겠습니까?");
		money = keyin.nextInt(); //
		
		int result = bank[position].deposit(money);
		if(result == 0) {
			System.out.println("> 금액을 정확히 입력하세요");
			return;
		}
		System.out.println("** 입금 완료");
		System.out.println("** 잔액: " + bank[position].getBalance());
	}
	
	/**
	 * 계좌 정보 출력
	 */
	private void output() {
		System.out.println("\n[ 전체 고개 계좌 확인 ]");
		if(count == 0) {
			System.out.println("> 계좌개설이 안되어 있습니다.");
			return;
		}

		for(int i=0; i<count; ++i) {
			bank[i].output();	
		}

	}
	/**
	 * 고객의 계좌번호, 이름, 잔액을 입력받아 계좌를 개설한다.
	 * count가 5보다 작은 경우에만 개설가능
	 * 동일한 계좌번호는 계좌개설을 할 수 없다.
	 */
	private void create() {
		String accountNo;
		String accountName;
		int balance;

		System.out.println("\n[ 계좌 개설 ]");
		if(count >= bank.length) {
			System.out.println("** 계좌 개설이 어렵습니다.");
			return;
		}

		// 계좌를 생성하기 위해 입력을 받는다.
		System.out.print("* 계좌번호: "); // 
		accountNo = keyin.next();

		for(int i=0; i < count; ++i) {
			BankAccount temp = bank[i];
			if(temp.getAccountNo().equals(accountNo)) {
				System.out.println("> 계좌번호가 잘못되었습니다.");
				return;
			}
		}

		System.out.print("* 계좌주명: ");
		accountName = keyin.next();

		System.out.print("* 입금액: ");
		balance = keyin.nextInt();

		bank[count] = new BankAccount(accountNo, accountName, balance);
		++count;
		System.out.println("** 계좌개설이 완료되었습니다.");
	}

	public void menu() {
		System.out.println("===[ XX 은행 ATM 서비스 ]===");
		System.out.println("        1. 계좌 개설");
		System.out.println("        2. 입     금");
		System.out.println("        3. 출     금");
		System.out.println("        4. 계좌 조회");
		System.out.println("        5. 전체 계좌 확인");
		System.out.println("        0. 종     료");
		System.out.println("============================");
		System.out.print  ("          > 선택: "  );
	}
}