package basic;
import java.util.*;
public class UserInteraction {
	
	
	public void takeInput() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Calc obj=new Calc();
		int x=obj.doAdd(a,b);
		System.out.println(x);
		
	}
	public static void main(String []args) {
		UserInteraction obj1=new UserInteraction();
		obj1.takeInput();
		
		
	}
	

}
