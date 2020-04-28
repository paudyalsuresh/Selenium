package getinput;

import java.util.Scanner;

public class getinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1=new Scanner(System.in);
		System.out.println(" enter your name:");	
		String name=s1.nextLine();
		System.out.println("enter your age:");
		String age=s1.nextLine();
		
		System.out.println("your name is:"+name+" and age is:"+age);
		
		
		
	}

}
