package p2;

public class OverLoad1 {
void area(float r) {//area of circle
	float c;
	c=3.1459f*r*r;
}
void area(int s) {
	int rec;
	rec=s*s;
}
void area(int l, int b) {
	int sq;
	sq=l*b;
}
	public static void main(String[] args) {
		OverLoad1 ob=new OverLoad1();
		ob.area(5.6f);//area of circle
		ob.area(8);//area of sq
		ob.area(5, 8);
		System.out.println();

	}

}
