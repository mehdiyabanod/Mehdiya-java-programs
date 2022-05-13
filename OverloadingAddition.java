package p2;
class Addition1{
	int a;
	int b;
	float bf;
	double c;
	void add(int a,int b) {
		int sum=a+b;
		System.out.println("sum of two int values is="+sum);
	}
	void add(int a,float bf) {
		float sum=a+bf;
		System.out.println("sum of Integer and float values is="+sum);
	}
	void add(int a,double c) {
		double sum=a+c;
		System.out.println("Sum of Integer and double values is="+sum);
	}
	}

public class OverloadingAddition {

	public static void main(String[] args) {
Addition1 ob=new Addition1();
ob.add(23, 44);
ob.add(55, 87.65f);
ob.add(66, 90.7);


	}

}
