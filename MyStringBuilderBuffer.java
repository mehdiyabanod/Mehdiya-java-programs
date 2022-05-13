package mehdiya.com;

public class MyStringBuilderBuffer {

	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("Hello");
		b.insert(2, "h1");
		System.out.println(b);
		b.append("Bangalore");
		System.out.println(b);
		b.replace(3, 5, "How are you");
		System.out.println(b);
		b.reverse();
		System.out.println(b);
        b.delete(2, 5);
        System.out.println(b);
	}

}
