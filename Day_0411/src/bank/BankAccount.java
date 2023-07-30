package bank;
// VO(Value Object)

public class BankAccount {
	private String accountNo;
	private String accountName;
	private int balance;
	
	public BankAccount() {}
		
	public BankAccount(String accountNo, String accountName, int balance) {
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getBalance() { 
		return balance;
	}
	public void setBalance(int balance) { 
		this.balance = balance;
	}
	
	// 돈을 인출하는 메소드를 작성 : 
	// 전달인자로 인출할 금액을 전달받음
	// balance < money ==> 0반환
	// balance >= money ==> money 반환, 잔액은 차감
	public int withdraw(int money) {
		if(balance < money) return 0;
		this.balance -= money;
		return money;
	}
	
	// 입금
	// 0, 음수가 입력되면 안됨 ==> 0반환
	// balance + money 
	public int deposit(int money) {
		if(money <= 0 ) return 0;
		this.balance += money;
		return this.balance;
	}
	
	// output 메소드
	public void output() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("계 좌 주: " + accountName);
		System.out.println("잔    액: " + balance);
	}
}







