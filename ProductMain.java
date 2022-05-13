package p1;

       import java.util.ArrayList;
import java.util.Iterator;
		class Product{
		int pid;
		String pname;
		float pprice;
		public Product(int pid, String pname, float pprice) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.pprice = pprice;
		}
		
		}
		public class ProductMain {
			public static void main(String[] args) {
				ArrayList<Product> ob=new ArrayList<>();
				Product ob1=new Product(1,"Soap",250.00f);
				Product ob2=new Product(2,"Chocolate",300.00f);
				Product ob3=new Product(3,"fish",400.00f);
				Product ob4=new Product(4,"Biryani",500.00f);
				Product ob5=new Product(5,"Custed",600.00f);
				
			ob.add(ob1);
			ob.add(ob2);
			ob.add(ob3);
			ob.add(ob4);
			ob.add(ob5);
			Iterator<Product> pit=ob.iterator();
			while(pit.hasNext()) {
				Product p=pit.next();
				System.out.println(p.pid+" "+p.pname+" "+p.pprice);
			}
			
	
	}

}
