package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		while (num <= 10)
		{
			if(num == 6)
			{
				num = num + 2;
				continue; //to skip the current iteration and break to come out of the loop
			}
			System.out.println(num);
			num = num + 2;
		}
		
		System.out.println("After while loop");
		
		//for loop
		for(int i =1; i<=10; i++)
		{
			if(i == 6) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("After for loop");
		
		//for each loop
		int[] array1 = {10, 20, 30, 40, 50};
		for(int num1:array1) {
			System.out.println(num1);
		}
		
		System.out.println("After for each loop");
		
		//print array values using for
		
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		//reverse the string
		String str = "Clean World Green World";
		String[] s1 = str.split(" ");
		for(int i= s1.length-1; i>=0; i--) {
			System.out.print(s1[i] + " ");
		}
	
		
		//without split
		
		for(int i= str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}
