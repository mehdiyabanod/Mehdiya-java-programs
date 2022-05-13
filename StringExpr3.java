package mehdiya.com;

import java.util.Scanner;

public class StringExpr3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String s=sc.nextLine().toLowerCase();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
		System.out.println(ch);
			continue;
		}
	else {
	ch=(char) (ch+s.charAt(i));
	}
	}
	System.out.println("After removing vowels ");
	System.out.println(s);
}
}
