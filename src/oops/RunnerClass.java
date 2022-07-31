package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1 = new Employee();
		E1.Name = "Mike";
		E1.EmpId = 1290;
		E1.Department = "HR";
		E1.display();
		
		Employee E2 = new Employee("Mili", 1291, "Marketing");
		E2.display();
		
		Bank B = new Bank();
		B.DisplayBalance();
		int Bal = B.GetBalance();
		System.out.println("The Balance is: " + B.GetBalance());
		System.out.println("The Balance is: " + Bal);
		
		BOABank B1 = new BOABank();
		B1.DisplayBalance();
		B1.CCBalance();
		
		OverloadingExample a = new OverloadingExample();
		float b = a.GetArea(2.5f);
		System.out.println(b);
		
		HondaCar car1 = new HondaCar();
		CarInterface car = new HondaCar();
		
		EncapsulationExample e = new EncapsulationExample();
		e.setBalance(4000);
		System.out.println(e.getBalance());
	}

}
