package pkgStackPalindrome;

public class cStack {
	cElement top, bottom;
	String word;
	int total;
	cStack(){
		top = bottom = null;
		total = 0;
		System.out.println("Object stack has been created...");
	}
	
	public void push (cElement newest) {
		if(top == null) {
			top = bottom = newest;
		}
		else {
			newest.next = top;
			top = newest;
		}
		System.out.println("Push OK...");
	}
	
	public cElement pop() {
		if(top == null) {
			System.out.println("Stack empty!");
			return null;
		}
		else if(top.next == null) {
			cElement t = top;
			top = bottom = null;
			System.out.println("Pop OK...");
			return t;
		}
		else {
			cElement t = top;
			top = top.next;
			t.next = null;
			System.out.println("Pop OK...");
			return t;
		}
	}
		 
	public void palindrome(cElement pl) {
		word = pl.getName();
		boolean palindrome = false;
		for (int i = 0; i < word.length(); i++) {
			cElement wd = new cElement(word.charAt(i));
			push(wd);
		}
		for (int i = 0; i < word.length(); i++) {
			if(pop().getChars() == word.charAt(i)) {
				System.out.println("Same");
				palindrome = true;
			}
			else {
				System.out.println("Not same");
				palindrome = false;
				break;
			}
		}
		if(palindrome == true) {
			System.out.println("This word is palindrome");
		}
		else {
			System.out.println("This word isn't palindrome");
		}
	}
}
