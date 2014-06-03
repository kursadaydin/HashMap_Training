import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Test_CD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD cd1 = new CD(1, "The Beatles", "The Beatles 1");
		CD cd2 = new CD(2, "Prince", "The Very Best of Prince");
		CD cd3 = new CD(3, "Garth Brooks", "The Ultimate Hits");
		CD cd4 = new CD(3, "Garth Brooks", "The Ultimate Hits");
		
		Map<String, CD> cdCollection = new HashMap<>();
		
		cdCollection.put("B00004ZAV3", cd1);cdCollection.put("B00005M989", cd2);
		cdCollection.put("B00UVT390I", cd3);cdCollection.put("B00005M133", cd4);
		
				
		Iterator it = cdCollection.entrySet().iterator();
		
		while (it.hasNext()) {
			Entry<String, CD> key = (Entry<String, CD>) it.next();
			System.out.print("Key :" + key.getKey());
			System.out.println(" Value :" + key.getValue());
			
			
		
		
		
		
	}

	}
}
