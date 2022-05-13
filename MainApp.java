package p1;

class OuterClass {
	int i;

	private class InnerClass {
		int varinner;

		InnerClass() {
			varinner = 10;

		}

		void method_inner() {
			System.out.println("InnerClass Method=" + varinner);
			System.out.println("outer class variable i=" + i);
		}

	}// Inner class end

	void outer_method() {
		InnerClass ob = new InnerClass();
		ob.method_inner();// call inner class method

	}

}

public class MainApp {

	public static void main(String[] args) {
OuterClass ob=new OuterClass();
ob.outer_method();
	}

}
