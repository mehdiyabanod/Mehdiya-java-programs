package p1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {
	LinkedHashMap<Integer,String> ob=new LinkedHashMap<Integer,String>();
	ob.put(1, "Zain");
	ob.put(3,"alaika");
	ob.put(4, "yashfin");
	ob.put(2, "zefain");
	System.out.println(ob);
System.out.println(" ");
for(Map.Entry<Integer, String>m:ob.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());

}

	}

}

