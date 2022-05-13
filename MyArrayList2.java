package com.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Student{
	int sid;
	String name;
	float fees;
public Student(int sid, String name, float fees) {
		super();
		this.sid = sid;
		this.name = name;
		this.fees = fees;
	}
}
public class MyArrayList2{
public static void main(String[] args) {
	ArrayList<Student>ob=new ArrayList<>();
	Student sob1=new Student(1,"Zain",354.5f);
	Student sob2=new Student(2,"Alaika",768.4f);
	Student sob3=new Student(3,"Yashfin",453.3f);
	ob.add(sob1);
	ob.add(sob2);
	ob.add(sob3);
	Iterator<Student> sit=ob.iterator();
	while(sit.hasNext()) {
		Student s=sit.next();
		System.out.println(s.sid +" "+s.name+" "+s.fees);
		
	}
}
}
