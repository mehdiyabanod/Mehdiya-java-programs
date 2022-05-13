package p1;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassWork1 {

	public static void main(String[] args) {
		ArrayList<String> ob=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many names");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("enter the name");
			String n1=sc.nextLine();
			ob.add(n1);
			
		}
	System.out.println("ArrayList="+ob);
	
	

	}

}

