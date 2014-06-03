
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> il = new HashMap<Integer, String>();
		
		il.put(1, "Adana"); il.put(2, "Adýyaman");il.put(3, "Afyon"); 
		
		Set<Integer> s =il.keySet();
		Iterator<Integer> it =s.iterator();
		
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.print("Key : " + key);
			System.out.println(" Value : " + il.get(key));
			
		}
	}

}
