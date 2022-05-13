package p1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student1TreeSet {
	int id;
	String name;

	public Student1TreeSet(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}

class StudentNameCompare implements Comparator<Student1TreeSet> {

	@Override
	public int compare(Student1TreeSet o1, Student1TreeSet o2) {
		if (o1.name == o2.name)
			return 0;
		else
			return 1;

	}

}

public class TreeSetStudentMainApp {

	public static void main(String[] args) {
		TreeSet<Student1TreeSet> ob = new TreeSet<Student1TreeSet>(new StudentNameCompare());
		Student1TreeSet tob1 = new Student1TreeSet(4, "zain");
		Student1TreeSet tob2 = new Student1TreeSet(3, "alaika");
		Student1TreeSet tob3 = new Student1TreeSet(2, "yashfin");
		Student1TreeSet tob4 = new Student1TreeSet(1, "zefain");
		ob.add(tob4);
		ob.add(tob3);
		ob.add(tob2);
		ob.add(tob1);
		System.out.println("Sorting Based On The Name");
		Iterator<Student1TreeSet> it1 = ob.iterator();
		while (it1.hasNext()) {
			Student1TreeSet sob1 = it1.next();
			System.out.println("id =" + sob1.id + "name =" + sob1.name);
		}
	}

}
