public class AccountTest{  

	public static void main(String[] args){  
		Account a1 = new Account("Joe Doe");  
		a1.displayAccountInfo();  
		  
		a1.deposit(40000);  
		a1.displayAccountInfo();  

		a1.withdraw(15000);  
		a1.displayAccountInfo();  

		a1.withdraw(35000);  
		a1.displayAccountInfo();   
	}
}   