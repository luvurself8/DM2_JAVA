package bank;

import java.util.Scanner;

public class BankAccountService {
	Scanner keyin = new Scanner(System.in);
	BankAccount bank; // null

	public BankAccountService() {
		String choice; // x

		while(true) {
			menu();
			choice = keyin.next();
			switch(choice) {
			case "1" : create(); break;                     
			case "2" : deposit(); break;
			case "3" : withdraw(); break;
			case "4" : output(); break;
			case "0" : 
					System.out.println("** 프로그램을 종료합니다.");
					return;
			default : System.out.println("> 오류 : 메뉴를 다시 선택하시오\n");

			}
		}
	}
	/**
	 * 출금
	 */
	private void withdraw() {
		System.out.println("\n[ 출 금 ]");
		int money;
		
		if(bank == null) {
			System.out.println("> 계좌개설이 안되어 있습니다.");
			return;
		}
		
		System.out.print("** 얼마를 출금하시겠습니까?");
		money = keyin.nextInt();
		
		int result = bank.withdraw(money);
		if(result <= 0) {
			System.out.println("** 잔액이 부족합니다.");
			return;
		}
		
		System.out.println("> 출금 후 잔액: " + bank.getBalance());
		
		// 돈을 입력받는다. money
		// bank의 withdraw() 반환된 값이 0 "** 잔액이 부족합니다."
		// 잔액출력해줌
	}
	/**
	 * 입금
	 */
	private void deposit() {
		// 돈을 입력받는다. money
		// bank의 deposit() 반환된 값이 0 "** 금액을 정확히입력해주세요"
        // 0이 아니면 "** 입금 완료
		// 현재 잔액을 출력함
		System.out.println("\n[ 입 금 ]");
		int money;
		
		if(bank == null) {
			System.out.println("> 계좌개설이 안되어 있습니다.");
			return;
		}
		
		System.out.print("** 얼마를 입금하시겠습니까?");
		money = keyin.nextInt();
		
		int result = bank.deposit(money);
		
		if(result <= 0) {
			System.out.println("** 금액을 정확히입력해주세요");
			return;
		}
		System.out.println("** 입금 완료");
		System.out.println("> 출금 후 잔액: " + bank.getBalance());
		
	}
	/**
	 * 계좌 정보 출력
	 */
	private void output() {
		System.out.println("\n[ 잔액 확인 ]");
		if(bank == null) {
			System.out.println("> 계좌개설이 안되어 있습니다.");
			return;
		}
		bank.output();

	}
	/**
	 * 고객의 계좌번호, 이름, 잔액을 입력받아 계좌를 개설한다.
	 */
	private void create() {
		String accountNo;
		String accountName;
		int balance;

		System.out.println("\n[ 계좌 개설 ]");
		if(bank != null) {
			System.out.println("** 계좌 개설이 어렵습니다.");
			return;
		}

		System.out.print("* 계좌번호: ");
		accountNo = keyin.next();

		System.out.print("* 계좌주명: ");
		accountName = keyin.next();

		System.out.print("* 입금액: ");
		balance = keyin.nextInt();

		bank = new BankAccount(accountNo, accountName, balance);
		System.out.println("** 계좌개설이 완료되었습니다.");
	}

	public void menu() {
		System.out.println("===[ XX 은행 ATM 서비스 ]===");
		System.out.println("        1. 계좌 개설");
		System.out.println("        2. 입     금");
		System.out.println("        3. 출     금");
		System.out.println("        4. 잔액 확인");
		System.out.println("        0. 종     료");
		System.out.println("============================");
		System.out.print  ("          > 선택: "  );
	}
}





