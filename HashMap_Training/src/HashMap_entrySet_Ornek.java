import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class HashMap_entrySet_Ornek {

public static void main(String[] args) {
		
		Map<Integer, String> ilkodlari_A = new HashMap<>();
		
		ilkodlari_A.put(1, "Adana");ilkodlari_A.put(2, "Adýyaman");ilkodlari_A.put(3, "Afyon");
		ilkodlari_A.put(4, "Aðrý");ilkodlari_A.put(5, "Amasya");ilkodlari_A.put(6, "Ankara");
		ilkodlari_A.put(7, "Antalya");ilkodlari_A.put(8, "Artvin");ilkodlari_A.put(9, "Aydýn");
		
		Map<Integer, String> ilkodlari_B = new HashMap<>();
		
		ilkodlari_B.put(10, "Balýkesir");ilkodlari_B.put(11, "Bilecik");ilkodlari_B.put(12, "Bingöl");
		ilkodlari_B.put(13, "Bitlis");ilkodlari_B.put(14, "Bolu");ilkodlari_B.put(15, "Burdur");
		ilkodlari_B.put(16, "Bursa");
		
		ilkodlari_A.putAll(ilkodlari_B);
		//ilkodlari.clear();
		//ilkodlari.remove(3);
		//ilkodlari.replace(1, "AAAdana");
		 
		
		/*for (int i = 1; i < ilkodlari.size()+1; i++) {
			System.out.println(ilkodlari.get(i));	
		}
		*/
		Iterator it = ilkodlari_A.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry deger = (Entry) it.next();
			System.out.println("Plaka kodu " + deger.getKey() + " olan þehrin adý " + deger.getValue() + " dir.");
		
			
			
		}
			
		}	
}
