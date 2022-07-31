package oops;

public class Bank {

	public int AccountNumber;
	
	public void DisplayBalance() {
		System.out.println("Inside Account Balance");
	}
	
	public int GetBalance() {
		return 100;
	}
	
	public void CloseAccount() {
		System.out.println("Inside Close Account");
	}
}
