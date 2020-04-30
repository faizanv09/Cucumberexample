
public class test2 extends test3 implements Test1 {

	public static void main(String[] args) {
		
		test2 tr = new test2();
		
		tr.account();
		Test1 tr1 =new test2();
		tr1.deposit();
		
						// TODO Auto-generated method stub

	}

	@Override
	public void account() {
		// TODO Auto-generated method stub
		
		System.out.println("account created");
		
	}

	@Override
	public void deposit() {
		
		System.out.println("amount deposited");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

}
