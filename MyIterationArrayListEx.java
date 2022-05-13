package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MyIterationArrayListEx {

	public static void main(String[] args) {
		int e;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> I = new ArrayList<Integer>();
		System.out.println("How many elements you want");
		int n = sc.nextInt();
		System.out.println("Enter" + n + "elements into arraylist");
		for (int i = 1; i <= n; i++) {
			e = sc.nextInt();
			I.add(e);
		}
		System.out.println("Using list" + I);
		for (Integer i : I) {
			System.out.println(i);
		}
		System.out.println("Iterating elements using Iterator interface");
		Iterator it = I.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}

}
