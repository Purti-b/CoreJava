package test;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String str = "Clean World Green World";
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			switch(ch) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
					break;
			}
			
		}
		System.out.println("The vowel count is " + count);
	}

}
