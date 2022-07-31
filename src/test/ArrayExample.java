package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {10, 20, 30, 40, 50};
		System.out.println("Total numbers are " + array1.length); //to get length of array
		System.out.println("Second number is " + array1[1]); //to get the value of specific index
		System.out.println("Last number is " + array1[array1.length-1]); //to get value present at last index
		
		String[] array2 = {"abc", "ijk", "lmn", "pqr", "xyz"}; //string array
		
		String array3 = "Clean world Green world";
		String[] s1 = array3.split(" "); //split any string by space
		System.out.println("The first word is " + s1[0]); //to get word
		System.out.println("The last word is " + s1[s1.length-1]); //to get last word
	}

}
