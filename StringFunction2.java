package mehdiya.com;

import java.util.Scanner;

public class StringFunction2 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int c=0;
String s;
System.out.println("Enter a string");
s=sc.nextLine().toLowerCase();

System.out.println("Enter a character");
char ch=sc.next().charAt(0);

for(int i=0;i<s.length();i++) {
	if(ch==s.charAt(i)) {
		c++;
		
	}
}
System.out.println(ch+"character is present"+c);

	}

}
