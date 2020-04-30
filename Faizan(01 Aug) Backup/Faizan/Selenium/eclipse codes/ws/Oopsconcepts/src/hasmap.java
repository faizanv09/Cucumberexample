import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hasmap {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(0, "first");
		hm.put(1,"second");
		hm.put(2, "third");
		System.out.println(hm);
        Set sn =hm.entrySet();
        Iterator it  = sn.iterator();
        while(it.hasNext()){
        	
        	Map.Entry mp =(Map.Entry)it.next();
        	System.out.println(mp.getValue());
        	System.out.println(mp.getKey());
        }
        
	}

}
