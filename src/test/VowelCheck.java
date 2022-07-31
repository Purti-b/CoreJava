package test;

public class VowelCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String str = "Clean World Green World";
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (ch== 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Vowel count is: " + count);
	}

}
