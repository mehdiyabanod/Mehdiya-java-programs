package p1;

import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer>Listob=new LinkedList<Integer>();
		System.out.println(Listob);
		Listob.add(12);
		Listob.add(23);
		Listob.add(34);
		Listob.add(45);
		Listob.add(56);
		System.out.println(Listob);
		Listob.addFirst(100);
		System.out.println(Listob);
		Listob.addLast(200);
		System.out.println(Listob);
		System.out.println(Listob.get(2));
		System.out.println(Listob);
		System.out.println(Listob.isEmpty());
		
	
	}
		
		
		
	}


