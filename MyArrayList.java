package p1;

import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> lst=new ArrayList<>();
	int e;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("How many elements");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
	
		System.out.println("Enter the elements");
		e=sc.nextInt();
		lst.add(e);
	}
	System.out.println("ArrayList elements ="+lst);
	System.out.println("Enter element to search");
	int s=sc.nextInt();
	if(lst.contains(s)) {
		System.out.println(s+"Present in list");
	}else {
	
	}
	}
}


