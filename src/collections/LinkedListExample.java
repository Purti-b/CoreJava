package collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list.add("john");
		list.add("jack");
		list.add("Jill");
		list1.add(25);
		
		System.out.println("The list consist of:" + list);
		System.out.println("Size is: " + list.size());
		System.out.println("List1 consist of: " + list1);

	}

}
