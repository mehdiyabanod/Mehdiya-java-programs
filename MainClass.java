package p2;

import p2.DemoStatic;

class DemoStatic {
	static int i;
	int j;

	static {
		System.out.println("static block it is called");
		i = 1;
	}

	DemoStatic() {
		System.out.println("Constructor");
	}
}

public class MainClass {
	static {
		System.out.println("static 1 before main");
	}
	static {
		System.out.println("static 2 before main");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		DemoStatic ob = new DemoStatic();

	}

}
