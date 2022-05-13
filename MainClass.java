//polymorphism 2types: compile time within class function Overloading
//run time inheritance function overloading
package p2;

class DisplayOverload {
	void display() {// no argument function
		System.out.println("No argument display");
	}

void display(int i) {
	System.out.println("int one argument function "+i);
}

	void display(float i) {
		System.out.println("float one argument function " + i);
	}

	void display(int i, int j) {
		System.out.println("two int argument function " + i + "and " + j);
	}

	void display(int i, int j, int k) {
		System.out.println("three int argument function " + i + "," + j + "and" + k);
	}

	void display(float i, float j) {
		System.out.println("two float argument function " + i + "and" + j);
	}

	void display(int i, float j) {// by changing order
		System.out.println("int and float two argument function " + i + "and" + j);
	}

	void display(float j, int i) {
		System.out.println("float and int two argument function " + i + "and" + j);
	}

	void display(byte p) {
		System.out.println("byte int" + p);
	}
}

public class MainClass {

	public static void main(String[] args) {
		DisplayOverload ob = new DisplayOverload();
		ob.display();// no arg
		ob.display((byte) 4);// one int
		ob.display(4.5f);
		ob.display(4, 6);
		ob.display(2, 6, 8);

	}

}
