package p1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StudentTreeSet {
	int sid;
	String sname;

	public StudentTreeSet(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

}

class StudentIdCompare implements Comparator<StudentTreeSet> {

	@Override
	public int compare(StudentTreeSet o1, StudentTreeSet o2) {
		if (o1.sid == o2.sid)
			return 0;
		else if (o1.sid > o2.sid)
			return 1;
		else
			return -1;

	}

}

public class TreeSetStudentMain {

	public static void main(String[] args) {
		TreeSet<StudentTreeSet> ob = new TreeSet<StudentTreeSet>(new StudentIdCompare());
		StudentTreeSet tob1 = new StudentTreeSet(9, "Zain");
		StudentTreeSet tob2 = new StudentTreeSet(3, "alaika");
		StudentTreeSet tob3 = new StudentTreeSet(8, "yashfin");
		StudentTreeSet tob4 = new StudentTreeSet(2, "zefain");
		ob.add(tob4);
		ob.add(tob3);
		ob.add(tob2);
		ob.add(tob1);
		System.out.println("Sorting based on the id");
		Iterator<StudentTreeSet>it1=ob.iterator();
		while(it1.hasNext()) {
			StudentTreeSet sob1=it1.next();
			System.out.println("sid="+sob1.sid+"sname="+sob1.sname);
		}
		

	}

}
