import java.util.HashSet;
import java.util.Iterator;

public class hashst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("first");
		hs.add("second");
		hs.add("third");
		
		System.out.println(hs);
		
		Iterator<String> i =hs.iterator();
		while(i.hasNext()){
			
			System.out.println(i.next());
		}
		
		

	}

}
