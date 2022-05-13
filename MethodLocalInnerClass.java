//Method local inner class(defining a class inside a method 
package p1;

class MyOuterClass {
	void method() {
		System.out.println("Outer Class Method");
		class MyLocalInnerClass {
			int n;

			void innerMethod() {
				System.out.println("Inner Class Method");

			}
		}// Local Inner Class ends
		MyLocalInnerClass iob = new MyLocalInnerClass();
		iob.innerMethod();
	}// method ends

}

public class MethodLocalInnerClass {

	public static void main(String[] args) {
MyOuterClass ob=new MyOuterClass();
ob.method();
	}

}
