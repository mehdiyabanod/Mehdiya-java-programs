package p2;

class Overloaidng {
void display() {
	System.out.println("Display with no argument");
}
void display(int i) {
	System.out.println("One argument of type Integer");
}
void display(float i) {
	System.out.println("One argument of type float");
}
void display(double i) {
	System.out.println("One argument of type double");
}
void display(String i) {
	System.out.println("One argument of type string");
}
void display(int i,int j) {
	System.out.println("Two argument of type Integer");
}
void display(int i,float j) {
	System.out.println("Two argument of type Integer and float ");
}
void display(float j,int i) {
	System.out.println("Two ragument of type float and Integer");
}
	}
public class PolymorphisamDemoMain{
public static void main(String[] args) {
	Overloaidng ob = new Overloaidng();
	ob.display();
	ob.display(654.54);
	ob.display(765.45f);
	ob.display(56);
	ob.display(67,87);
	ob.display(67,6f);
	
	System.out.println(ob);
	}
}
