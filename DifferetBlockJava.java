package p1;

public class DifferetBlockJava {
	static {
		System.out.println("static executes before main");
	}
	{
		System.out.println("normal block");
		System.out.println("normal block will executes on object creation before constructor block");
	}

	public static void main(String[] args) {
		System.out.println("MainBlock");
		DifferetBlockJava ob = new DifferetBlockJava();

	}

}
