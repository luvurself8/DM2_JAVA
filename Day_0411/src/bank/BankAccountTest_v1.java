package bank;

public class BankAccountTest_v1 {
	public static void main(String[] args) {
		int money = 5000; 
		
		BankAccount ba = new BankAccount();
		ba.output();
		
		System.out.println("===============");
		BankAccount bc = new BankAccount("4567", "임꺽정", 50000);
		bc.output();
		
		System.out.println("===============");
		
		ba.setAccountNo("1234");
		ba.setAccountName("전우치");
		ba.setBalance(10000);
		
		System.out.println(money + "원 입금");
		ba.deposit(money);
		
		int result = ba.getBalance();
		
		System.out.println("잔액 : " + result);
		
		ba.output();
		
		money = 20000;
		System.out.println();
		System.out.println(money + "원 출금");
		result = ba.withdraw(money);
		
		System.out.println("결과 : " + result);
		System.out.println("잔액확인:" + ba.getBalance());
		
		ba.output();
	}
}
