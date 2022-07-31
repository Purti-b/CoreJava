package test;

public class ReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse = "";
		String str = "Clean World Green World";
		for(int i= str.length()-1; i>=0; i--) {
			reverse = reverse+str.charAt(i);
		}
		System.out.println("Revrse string is: " +reverse);
		
		int num = 456789;
		int result = 0;
		
		while(num>0) {
		int rem = num%10;
		result = result*10+rem;
		
		num = num/10;
		}
		
		System.out.println(result);
		
	}

}
