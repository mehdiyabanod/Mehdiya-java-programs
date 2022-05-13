package p1;

public class OverLoad {
	void series() {

	}

	void series(int p) {
		int cube = 0;
		for (int i = 1; i <= 5; i++) {
			cube = i * i * i;
			System.out.println(cube+",");
		}
	}

	void series(int x, int n) {

	}

	public static void main(String[] args) {
OverLoad ob=new OverLoad();
ob.series(5);
	}

}
