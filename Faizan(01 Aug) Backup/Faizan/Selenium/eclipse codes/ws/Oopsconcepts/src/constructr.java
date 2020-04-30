
public class constructr {
	
	public constructr(){
		
		System.out.println("This is constructor");
	}
	
	public constructr(int a,int b){
		int c = a + b;
		System.out.println(c);
		System.out.println("This is parametized");
	}
	public constructr(String str){
		System.out.println("Hello");
		
	}
	
	public constructr(double d,double e){ 
		
		 double f = d + e;
		System.out.println(f);
		
	}
	public void getdata(){
		System.out.println("This is not constructor");
	}

	public static void main(String[] args) {
			
		// TODO Auto-generated method stub
         constructr ne = new constructr();
         constructr np =new constructr(9,24);
         constructr ns = new constructr("test");
         constructr nj= new constructr();
         constructr nv = new constructr();
         nv.getdata();
         
         
	}

}
