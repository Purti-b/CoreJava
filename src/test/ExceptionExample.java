package test;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3, 4, 5};
		int num =10;
		try {
			int res = num/0;
			System.out.println(array[5]);
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("Inside array catch");
		}
		catch(ArithmeticException e ) {
			System.out.println("Inside arithmetic catch");
		}
		finally {
			System.out.println("Inside Finally");
		}
		
		System.out.println("After Execution");
	}

}
