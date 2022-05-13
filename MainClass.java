//single inheritance
package p1;
class A{//parent class or superclass
	int i;//instance variable
	A(){//constructor
		i=10;
		System.out.println("i=+i");
		
	}
}
class B extends A{//B is child class or subclass
	int j;
	B(){//constructor
		j=23;
		
	}
	void add() {
		int s=i+j;
		System.out.println("sum="+s);
	}
}
public class MainClass {
public static void main(String[] args) {
	B ob=new B();
	ob.add();
	

	}

}
