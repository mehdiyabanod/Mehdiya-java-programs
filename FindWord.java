package p1;

import java.util.Scanner;

public class FindWord {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s;
	System.out.println("Enter a sentence");
    s=sc.nextLine();
    System.out.println("Enter a word to find in a sentence");
	String w=sc.next();
	for(int i=0;i<s.length();i++) {
	System.out.println(w);
	}
	
	
	}

}
