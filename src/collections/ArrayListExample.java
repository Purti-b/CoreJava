package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list.add("john");
		list.add("jack");
		list.add("Jill");
		list1.add(25);
		
		System.out.println("The list consist of:" + list);
		System.out.println("Size is: " + list.size());
		System.out.println("List1 consist of: " + list1);
		
		list.remove(1);
		System.out.println("The new list consist of:" + list);
		System.out.println("Size is: " + list.size());
		
		System.out.println("Get element from index: " + list.get(1));
		list.set(1, "Humpty");
		System.out.println("The new list consist of:" + list);
		
		list.add(1, "jack");
		System.out.println("The new list consist of:" + list);
		
		Collections.sort(list);
		System.out.println("The new list consist of:" + list);
		
		//using for loop
		for(int i = 0; i<list.size(); i++) {
			System.out.println("Value at " + i + " " + list.get(i));
		}
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("The new list consist of:" + list);
		
		//using for each
		for(String name:list) {
			System.out.println(name);
		}
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).equals("jack")) {
				System.out.println(i);
				break;
			}
		}
			
	}

}
