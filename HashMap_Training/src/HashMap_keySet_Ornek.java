import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMap_keySet_Ornek {
	
	public static void main(String[] args) {
		
	
	Map<Integer, String> ilkodlari_A = new HashMap<>();
	
	ilkodlari_A.put(1, "Adana");ilkodlari_A.put(2, "Ad�yaman");ilkodlari_A.put(3, "Afyon");
	ilkodlari_A.put(4, "A�r�");ilkodlari_A.put(5, "Amasya");ilkodlari_A.put(6, "Ankara");
	ilkodlari_A.put(7, "Antalya");ilkodlari_A.put(8, "Artvin");ilkodlari_A.put(9, "Ayd�n");
	
	
		//Set<Integer> s = ilkodlari_A.keySet();
		Iterator it = ilkodlari_A.keySet().iterator();
	
	while (it.hasNext()) {
		
		Integer key =  (Integer) it.next();
		System.out.println("Il Kodu " + key + " olan �ehir " + ilkodlari_A.get(key) + "'d�r.");
	}
	

}

}

