package edu.com;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StudentTreeSet {
	int sid;
	int marks;
	String name;

	public StudentTreeSet(int sid, int marks, String name) {
		super();
		this.sid = sid;
		this.marks = marks;
		this.name = name;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

//tree set implements comparator interface
class StudentMarksCompare implements Comparator<StudentTreeSet> {

	@Override
	public int compare(StudentTreeSet o1, StudentTreeSet o2) {

		return o1.marks - o2.marks;
	}

}

public class TreeSetStudentMain {

	public static void main(String[] args) {
		TreeSet<StudentTreeSet> ob = new TreeSet<StudentTreeSet>(new StudentMarksCompare());
		StudentTreeSet tob1 = new StudentTreeSet(1, 101, "zain");
		StudentTreeSet tob2 = new StudentTreeSet(2, 102, "yashfin");
		StudentTreeSet tob3 = new StudentTreeSet(3, 103, "ronaldo");
		StudentTreeSet tob4 = new StudentTreeSet(4, 104, "alaika");
		StudentTreeSet tob5 = new StudentTreeSet(5, 105, "zefain");
		ob.add(tob1);
		ob.add(tob2);
		ob.add(tob3);
		ob.add(tob4);
		ob.add(tob5);
		Iterator<StudentTreeSet> it = ob.iterator();
		while (it.hasNext()) {
			StudentTreeSet sob = it.next();
			System.out.println("Sid=" + sob.getSid() + "Name=" + sob.getName() + "Marks=" + sob.getMarks());
		}

	}

}
