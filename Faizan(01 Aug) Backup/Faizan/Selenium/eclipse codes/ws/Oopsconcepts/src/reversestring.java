import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date();
		Calendar cdr =Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		System.out.println(sdf.format(dt));
		System.out.println(sd.format(dt));
		System.out.println(cdr.DAY_OF_YEAR);
		System.out.println(dt.toString());
		
	//	String s ="Testing";
	//	String t=" ";
		
	//	for (int i=s.length()-1;i>=0;i--){
			
		//	t = t + s.charAt(i);
		//}

		//System.out.println(t);
		
		
	}

}
