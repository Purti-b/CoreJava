package test;

public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 30;
		int num2 = 20;
		float div = (float) num1 / num2;
		int sum = num1 + num2;
		System.out.println("The sum of two number is " + sum);
		System.out.println("The division of two number is " + div);
		
		String s = "Clean world Green world";
		System.out.println(s);
		
		char ch = s.charAt(0); // to get any character from string present at any index
		System.out.println("The first character is " + ch);
		
		System.out.println("The length of string is " + s.length()); //to find length of string
		
		char ch1 = s.charAt(s.length()-1);
		System.out.println("The last character is " + ch1); // to get last letter of string
		
		System.out.println("String to uppercase " + s.toUpperCase()); //to covert to uppercase
		System.out.println("String to lowercase " + s.toLowerCase()); //to covert to lowercase
	}

}
