package myinterface;

public class citibank implements centralbank {
	
	public void deposit() {
		System.out.println("deposit 1000 per day");
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw 500 per day");
		
	}
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		
		citibank c1=new citibank();
		c1.deposit();
		c1.withdraw();
	}
	}
 
	
