package p1;

import java.util.Scanner;

public class Student {
	String name;
	int id;
	float fee;
	
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		name=sc.nextLine();
		System.out.println("Enter a id");
		id=sc.nextInt();
		System.out.println("Enter a fee");
		fee=sc.nextFloat();
		
	}
	void display() {
		System.out.println("name="+name);
		System.out.println("id="+id);
		System.out.println("fee="+fee);
	}
	

     
    	 
    	  public static void main(String[] args) {
    		  
    		  Student ob=new Student();
    		  ob.input();
    		  ob.display();
    		  
    	  }
      }
	
		

	


