package collections;

import java.util.HashMap;

public class WordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Clean World Green World Love World";
		String[] word = s.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String w: word) {
			if(map.get(w) == null) {
				map.put(w, 1);
			}
			else {
				int oldocc = map.get(w);
				map.put(w, oldocc+1);
			}
		}
		System.out.println(map);
	}

}
