
public class childclass extends parentclass{
	
	/*public childclass(){
		super(); 
		System.out.println("This is constructor");
	}
	
  String s ="test";
  public void getdata(){
	  System.out.println(s);
	  System.out.println(super.s);
  }
  public void getcl(){
	  super.getcl();
		System.out.println("This is child class");
	}*/


	public static void main(String[] args) {
				
		// TODO Auto-generated method stub

		/*childclass pc = new childclass();
		
		pc.getdata();
		pc.getcl();*/
		
		int a= 9;
		int b=0;
		
		
		
		try{
			
			int c= a/b;
			System.out.println(c);
		}
		
		catch (ArithmeticException sb){
			
			System.out.println("I found the Arithmetic");
		}
	
		catch (Exception s){
			
			System.out.println("I found the exception");
		}
	}

}
