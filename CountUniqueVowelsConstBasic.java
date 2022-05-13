package p1;

import java.util.Scanner;
import java.util.TreeSet;

public class CountUniqueVowelsConstBasic {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String s=sc.nextLine();
	
	TreeSet<Character> s1=new TreeSet<>();
	
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		s1.add(c);
		
		
	}
	System.out.println(s1);
	
	}

}
