
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
public class MapEntrySet {
  public static void main (String args[]){
     Map mp = new HashMap();
          mp.put(1, "A");
          mp.put(2, "B");
          mp.put(3, "C");
          System.out.println( mp);
          //Set view of the mappings contained in this map
          Set set = mp.entrySet();
          System.out.println("set =" + set);
          Iterator it =mp.entrySet().iterator();
         System.out.println("Set of mappings are :");
    while (it.hasNext()){
            Map.Entry me = (Map.Entry) it.next();
             System.out.println(me);
    }
  }
}