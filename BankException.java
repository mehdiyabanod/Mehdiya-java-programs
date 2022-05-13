package p1;

import java.util.Scanner;

class BankException extends Exception {
public BankException(String s) {
	super (s);
	
}
}
class SBIBank{
	int bankbalance;
	public SBIBank() {
		bankbalance=2000;
		}
	void withDraw(int WithDrawamt) {
		try {
			if(WithDrawamt>bankbalance) {
				throw new BankException("Insufficient balance");
				
			}
			else {
				bankbalance=bankbalance-WithDrawamt;
				System.out.println("Balance amounts="+bankbalance);
			}
			
		}catch(BankException e) {
			e.printStackTrace();
			
		}
	}
}