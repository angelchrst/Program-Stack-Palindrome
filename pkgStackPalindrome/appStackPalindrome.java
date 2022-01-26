package pkgStackPalindrome;

import java.util.Scanner;
public class appStackPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cStack stack = new cStack();
		int select = 0;
		do {
			System.out.println("\nMENU STACK PALINDROME");
			System.out.println("1. Palindrome");
			System.out.println("2. Exit");
			System.out.print("Select = ");
			select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.print("Input word = ");
				String wd = sc.next();
				cElement w = new cElement(wd);
				stack.palindrome(w);
				System.out.println("");
				break;
				
			case 2:
				System.out.println("Thank you...");
				break;
			}
		} while(select != 2);

	}

}
