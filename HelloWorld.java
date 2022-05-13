package p1;

public class HelloWorld {
	int i;
	float f;
	char ch;
	double d;
	String s;
	

	public static void main(String[] args) {
		HelloWorld ob=new HelloWorld();
		System.out.println("Default values of instance variable");
		System.out.println("int="+ob.i);
		System.out.println("float="+ob.f);
		System.out.println("double="+ob.d);
		System.out.println("char="+ob.ch);
		System.out.println("String="+ob.s);
	}

}
