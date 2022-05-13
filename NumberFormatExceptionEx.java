package p1;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		String s="Mehdiya";
		try {
		int i=Integer.parseInt(s);
		}catch(NumberFormatException t) {
			t.printStackTrace();
		}
		System.out.println(s);

	}

}
