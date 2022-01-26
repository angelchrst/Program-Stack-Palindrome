package pkgStackPalindrome;

public class cElement {
	private String name;
	private char chars;
	cElement next;
	cElement (String n){
		name = n;
		System.out.println("Object "+n+" created...");
	}
	
	cElement (char c){
		chars = c;
	}
	
	public String getName() {
		return name;
	}
	
	public char getChars() {
		return chars;
	}
}
