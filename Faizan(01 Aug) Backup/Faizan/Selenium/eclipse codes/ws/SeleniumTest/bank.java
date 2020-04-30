import java.util.Scanner;

public class bank {
	
	String accno;
	String  name;
	long balance =0;
	 
	Scanner NB = new Scanner(System.in);
	
	public void showacct(){
		System.out.println(accno+","+name+","+balance);
	}

	public int initialbalance(){
		
		int balance = 0;
		return balance;
	}
	
	public void deposit(){
		 long amt;
		 System.out.println("Enter the amount to deposit");
		 amt = NB.nextLong();
		 balance = amt + balance;
		 System.out.println(balance);
		 
		
		
				
	}
	public void withdraw(){
		
		long amt;
		long newbal;
		System.out.println("Amount to be withdrawn :");
		amt= NB.nextLong();
		balance = balance - amt;
		newbal = balance;
		System.out.println("Your current balance :" +newbal );
		
		
	}

}
