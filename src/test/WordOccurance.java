package test;

public class WordOccurance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Clean World Green World";
		String[] s = str.split(" ");
		for(int i=0; i<s.length; i++) {
			int count = 0;
			for(int j=0; j<s.length;j++) {
				
				if(j<i&&s[j].equals(s[i])) {
					break;
				}
				if(s[i].equals(s[j])) {
					count++;
				}				
			if(j==s.length-1) {
				System.out.println("Count of " + s[i] + " " + count);
			}
			}
			
			
		}
	}
}
