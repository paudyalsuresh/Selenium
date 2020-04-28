package inheritence;

public class car extends vehicle {
	
	String bodytype="hatchback";
	int lenghtofthecar=5;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car c1=new car();
		System.out.println(c1.bodytype);
		System.out.println(c1.lenghtofthecar);
		
		System.out.println(c1.noofsteering);
		System.out.println(c1.noofwheels);
		
		c1.accelrate();
		c1.canbreack();

	}

}
