package p1;

interface MyInt {
	void add();
	void sub();
}

public class AnnonymousInnerInterface {

	public static void main(String[] args) {
		// Annonymous inner class
		// can be applied to abstract class or iheritance
		MyInt ob = new MyInt() {

			@Override
			public void add() {
				System.out.println("Add ");

			}

			@Override
			public void sub() {
				System.out.println("sub");

			}

		};
		ob.add();
		ob.sub();
	}

}
