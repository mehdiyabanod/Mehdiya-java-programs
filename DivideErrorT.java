package p1;

public class DivideErrorT {

	public static void main(String[] args) {
		System.out.println("Main");
		int a[]=new int[5];
		System.out.println("Before Storing elements");
try {
	a[5]=67;
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("If run time error comes then catch will execute");
	e.printStackTrace();
}
		
		System.out.println("After Storing Array values");
	}

}
