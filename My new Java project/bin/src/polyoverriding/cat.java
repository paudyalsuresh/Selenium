package polyoverriding;

public class cat extends animal{
	
	public void sound() {
		System.out.println("meow meow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cat c1=new cat();
		
		c1.walk();
		c1.sleep();
		c1.sound();

	}

}
