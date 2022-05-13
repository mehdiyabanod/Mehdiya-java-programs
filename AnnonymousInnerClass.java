package p1;

abstract class MyAbstract {
	public abstract void add();

	public abstract void sub();
}

public class AnnonymousInnerClass {

	public static void main(String[] args) {
		// Annonymous inner class
		// can be applied to abstract class or iheritance
		MyAbstract ob = new MyAbstract() {

			@Override
			public void add() {
				System.out.println("Add method");

			}

			@Override
			public void sub() {
				System.out.println("sub method");

			}

		};
		ob.add();
		ob.sub();
	}

}
