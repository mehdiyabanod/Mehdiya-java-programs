//multiple inheritance
//constructor call
package p1;
class one{
one(){
System.out.println("one constructor");

	}
}
class two extends one{
		two(){
System.out.println("two constructor");			
		}
	}
class three extends two{
	three(){
		System.out.println("three constructor");
	}
}
class four extends three{
	four(){
		System.out.println("four constructor");
	}
}
public class ConstructorMain {

	public static void main(String[] args) {
four ob= new four();
}
}
