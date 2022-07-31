package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Jack");
		map.put(2, "Jill");
		map.put(3, "Humpty");
		map.put(4, "Dumpty");
		map.put(10, "jack");
		
		System.out.println(map);
		System.out.println("Data at 4th key: " + map.get(4));
		
		map.remove(3);
		System.out.println(map);
		
		for(Integer key: map.keySet()) {
			System.out.println("The key is: " + key);
			System.out.println("The value is: " + map.get(key));
		}
	}

}
