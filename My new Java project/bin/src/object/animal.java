package object;

public class animal {
	
	int noofeyes=2;
	int noofears=2;
	int nooflegs=4;
	
	public void walk()
	{
		System.out.println("i can walk");
	}
public void sleep() {
	System.out.println("i can sleep");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		animal dog= new animal();
		
		System.out.println(dog.noofeyes);
		System.out.println(dog.noofears);
		System.out.println(dog.nooflegs);
		dog.sleep();
		dog.walk();
		
		animal cat=new animal();
		System.out.println(dog.noofeyes);
		System.out.println(dog.noofears);
		System.out.println(dog.nooflegs);
		cat.sleep();
		cat.walk();
		
		
		

	}

}
