package encapsulation;

public class centralbank {
	
 int interestrate=8;
private int newinterestrate; 
	
	public void print() {
	
		System.out.println("current interest rate:"+interestrate ); 
		
	}
	
public void changeintrestrate(int newintrate) {
	
	interestrate=newintrate;
}

public int newinterestrate() {
	return newinterestrate;
}

public void setNewinterestrate(int newinterestrate) {
	this.newinterestrate = newinterestrate;
}
	
	
}
