package abstractclass;

public class dog extends animal {
	
	public void sound() {
		System.out.println("bow bow");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog d1=new dog();
		d1.sleep();
		d1.walk();
		d1.sound();

	}

}
