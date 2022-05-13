package p2;
class Shape{
	void area() {
		System.out.println("Area of shape class");
	}
}
class Square extends Shape{
	void rea() {
		System.out.println("Area of a Square class");
	}
}
class Reactangle extends Shape{
	void area() {
		System.out.println("Area of a reactangle class");
	}
}
public class MainclassOverriding {

	public static void main(String[] args) {
	Reactangle rob=new Reactangle();
	rob.area();
	}

}
