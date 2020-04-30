import java.util.ArrayList;
import java.util.LinkedList;

public class linklist {

	public static void main(String[] args) {
		
				// TODO Auto-generated method stub
		
		LinkedList<String> al = new LinkedList<String>();
		al.add("Hello");
		al.add("Java");
		al.add("world");
	
		al.add(0, "new");
		al.contains("test");
		System.out.println(al);
		System.out.println(al.contains("test"));
		al.get(2);
		System.out.println(al.get(2));
		al.set(1, "setc");
		System.out.println(al);

	}

}
