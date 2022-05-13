//static can apply to [variable] ,method and inner class  
package p1;

class DemoStatic {
	static int i;
	int j;

	DemoStatic() {
		i = 1;
		j = 1;
		System.out.println("static initial value of i=" + i);
		System.out.println("non static initial value of j=" + j);
	}

	void display() {
		i = i + 1;
		j = j + 1;
		System.out.println("static i=" + i);
		System.out.println("non static j=" + j);
	}
}

public class MainClass {

	public static void main(String[] args) {
System.out.println("Mian");
DemoStatic ob=new DemoStatic();
DemoStatic ob1=new DemoStatic();
ob.display();
ob1.display();
	}

}
