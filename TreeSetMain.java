//TreeSet class elements are sorted
package p1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		TreeSet<String> tob = new TreeSet<String>();
		tob.add("Zain");
		tob.add("Aliaka");
		tob.add("Yashfin");
		tob.add("Refain");

		System.out.println(tob);
		// ascending
		System.out.println("Ascending order");
		Iterator<String> it = tob.iterator();
		while (it.hasNext()) {
			System.out.println(it.hasNext());
		}

		// descending order
		System.out.println("Descending order");
		Iterator<String> it1 = tob.descendingIterator();
		while (it1.hasNext()) {
			System.out.println(it1.hasNext());

		}
	}

}
