package test;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 11;
		boolean flag = true;
		for(int j=2; j<i;j++){
			int rem = i%j;
			if(rem==0) {
				System.out.println("It's not a prime number");
				flag=false;
				break;
			}
			
		}
		if(flag==true) {
			System.out.println("It's a prime number");
		}
	}

}
