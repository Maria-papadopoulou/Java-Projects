import java.util.UUID;

public class Account{  

	private String accountNo;  
	private String name;  
	private float balance;  

	public Account(String name) {
		this.name = name;
		this.accountNo = UUID.randomUUID().toString();
	}

	//deposit method  
	public void deposit(float amount){  
		this.balance += amount;  
	}  

	//withdraw method  
	public void withdraw(float amount){  
		if(this.balance < amount){  
			System.out.println("Insufficient Balance");  
		} else {  
			this.balance -= amount;   
		}  
	}  
	
	//method to check the balance of the account  
	public float checkBalance() {
		return this.balance;
	}  

	//method to display the values of an object  
	public void displayAccountInfo() {
		System.out.println("Account No:\t" + this.accountNo);
		System.out.println("Account Owner:\t" + this.name);
		System.out.println("Balance $:\t" + this.balance); 
	}  

	//method to return the values of an object as a string  
	public String getAccountInfo() {
		return "Account No:\t" + this.accountNo
			+ "Account Owner:\t" + this.name
			+ "Balance $:\t" + this.balance;	
	}

}

