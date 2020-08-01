package ferramentas;

public class ex1Client {
	
	private int accountNumber;
	private String name;
	private double money;
	
	public ex1Client() {
		
	}
	
	public ex1Client(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public ex1Client(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		depositMoney(initialDeposit) ;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName( String name ) {
		this.name = name;
	}
	
	public int getAccountNumber () {
		return this.accountNumber;
	}
	
	public void depositMoney (double amount) {
		money += amount;
	}
	
	public void withdrawMoney ( double amount ) {
		money -= (amount + 5.00);
	}
	
	public double getMoney() {
		return money;
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+", holder: "
				+ name 
				+", Balance: $ "
				+ money ;
	}

}
