package p1;

public class NestedLoop {

	public static void main(String[] args) {
		for (int r = 1; r <= 6; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.println("* ");
			}
			System.out.println();
		}

	}
}
