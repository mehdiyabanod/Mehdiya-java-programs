package p2;

class Bank {
	float Interest;

	void rateOfInterest() {
		System.out.println("Rateof Interest"+Interest);
	}
}

class SBI extends Bank {
	void rateOfInterest() {
		Interest = 8;

		System.out.println("Rateof Interest"+Interest);
	}
}
class ICICI extends Bank {
	void rateOfInterest() {
		Interest = 9;

		System.out.println("Rateof Interest"+Interest);
	}
}
public class BankMainClass {

	public static void main(String[] args) {
Bank ob;
ob=new SBI();
ob.rateOfInterest();
ob=new ICICI();
ob.rateOfInterest();

	}

}
