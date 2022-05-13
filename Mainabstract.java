package MainAbs;
abstract class Area{
	abstract void calArea();
	Area(){
		System.out.println("abstract class can have constructor");
	}
	void display() {
		System.out.println("Method with the body");
	}
}
class Reactangle extends Area{

	@Override
	void calArea() {
		int l=4;
		int b=9;
		int area=l*b;
		System.out.println("area of reactangle="+area);
		
	}
	
}
public class Mainabstract {

	public static void main(String[] args) {
		
		Reactangle ob=new Reactangle();
		ob.calArea();
		

	}

}
