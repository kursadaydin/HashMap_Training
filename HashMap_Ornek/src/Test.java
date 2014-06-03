import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> il = new HashMap<Integer, String>();
		
		il.put(1, "Adana"); il.put(2, "Adýyaman");il.put(3, "Afyon"); 
		
		Iterator it = il.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry deger = (Entry) it.next();
			System.out.print("Plaka :"+ deger.getKey());
			System.out.println(" Ýl Adý :" + deger.getValue());
		}
		

	}

}
