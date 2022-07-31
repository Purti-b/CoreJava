package test;

public class PatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using nested for
		for (int i = 1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println("");
		}
		
		//using nested while
		for (int i = 1; i<=5; i++) {
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
		
	}

}
