package p1;

public class ArrayError {

	public static void main(String[] args) {
		int a=10, b=2, c=0;
		int ar[]=new int[4];
		System.out.println("Before Excption");
		try {
			System.out.println("Inside try");
			c=a/b;
			ar[6]=8;	
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		}finally {
			System.out.println("finaly block");
		}
	}

}
