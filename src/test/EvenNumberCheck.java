package test;

import java.util.Scanner;

public class EvenNumberCheck {

	public static void main(String[] args) {
		// To get input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		
		if (num%2 == 0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
	}

}
