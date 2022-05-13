package mehdiya.com;

public class MyStringBuilderBuffer2 {

	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("Hello");
		b.insert(5, "india");
		System.out.println("After Insert"+b);
		System.out.println(b);
        b.append("hi");
        System.out.println("After Append"+b);
        System.out.println(b);
	    System.out.println("After delete"+b);
	    b.deleteCharAt(5);
	    System.out.println(b);
		b.replace(1, 2, "How are you"+b);
	    System.out.println(b);
	    b.reverse();
	    System.out.println("After reverse"+b);
	    System.out.println(b);
	    
	
	}

}
