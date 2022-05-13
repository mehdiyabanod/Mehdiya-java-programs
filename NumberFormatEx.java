package p1;

public class NumberFormatEx {

	public static void main(String[] args) {
		String s = "zain";
		System.out.println("before parseInt");
		try {
			int i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		System.out.println("After parseInt");
	}

}
