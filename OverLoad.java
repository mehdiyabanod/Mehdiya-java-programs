package p2;

public class OverLoad {
//function with argument

	void series(int x, int n) {
		double s = 0;
		for (int i = 1; i <= n; i++) {
			s = s + Math.pow(x, i);
		}
		System.out.println("sum=" + s);
	}

	void series(int p) {
		for (int i = 1; i <= p; i++) {
			int t = 0;
			t = (i * i * i) - 1;

			System.out.println(t + ",");
		}
	}

	void series() {
		double s = 0;
		for (int i = 2; i <= 10; i++) {
			s = s + ((double) 1 / i);
		}
		System.out.println("sum=" + s);
	}

	public static void main(String[] args) {
		OverLoad ob = new OverLoad();
		ob.series(8);
		ob.series();
		ob.series(2, 5);
		int i = 8;
		short s;
		s = (short) i;
		// i=s implicit
		float s1 = 56.7f;
		double d;
		d = s1;// implicit
		s1 = (float) d;

	}

}
