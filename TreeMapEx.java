package p1;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> ob = new TreeMap<Integer, String>();
		ob.put(1, "asma");
		ob.put(3, "amjed");
		ob.put(2, "uzma");
		ob.put(5, "najma");
		ob.put(4, "sadiq");
System.out.println(ob);
for(Map.Entry<Integer, String>m:ob.entrySet()) {
System.out.println(m.getKey()+" "+m.getValue());	
}

	}

}
