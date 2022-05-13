package mehdiya.com;

public class StringExpr {

	public static void main(String[] args) {
		String s="Zain Alaika";
		
		System.out.println(s.indexOf(' '));
		System.out.println(s.lastIndexOf(' '));
		int li=s.lastIndexOf(' ');
		System.out.println(s.substring(li+1));
		System.out.println(s.substring(0,li));
		
String s1=s.substring(li+1);
String s2=s.substring(0,li+1);
System.out.println(s1+" "+s2);

System.out.println(s.substring(0,1));
System.out.println(s.substring(9,10));
System.out.println(s.substring(li+1));

String s3=s.substring(0,1);
String s4=s.substring(9,10);
String s5=s.substring(li+1);

System.out.println(s3+"."+s4+"."+s5);



	}

}
