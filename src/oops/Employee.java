package oops;

public class Employee {
	public String Name;
	public int EmpId;
	public String Department;
	
	public Employee() {
		System.out.println("constructor");
	}
	
	public Employee(String P1, int P2, String P3) {
		Name = P1;
		EmpId = P2;
		Department = P3;
	}
	
	public void display() {
		System.out.println(Name);
		System.out.println(EmpId);
		System.out.println(Department);
	}
}
