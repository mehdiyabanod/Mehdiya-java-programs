package p2;

class AddOverload {
	void add(int i, int j) {
		int s;
		s = i + j;
		System.out.println("The sum of " + i + "and" + j + "is+s");
	}

	void add(float i, float j) {
	}

	void add(double i, double j) {
	}
}

public class MainApp {

	public static void main(String[] args) {
AddOverload ob=new AddOverload();
//call all methods by passing values
ob.add(9, 10);
ob.add(7, 8.9);
ob.add(5.7f, 6.5f);
	}

}
