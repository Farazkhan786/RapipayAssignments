package basic;
import java.util.Scanner;
public class Interest {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		double p;
		int years;
		double ei=0;
		double interest=0;
		double ca=0;
		System.out.println("Enter the Years");
		years=sc.nextInt();
		for(int i=1;i<=years;i++)
		{
			System.out.println("Enter the Deposit for "+i+"th year");
			p=sc.nextDouble();
			ei=p+ca;
			interest=ei*0.09;
			ca=ei+interest;
			
			
		}
		

		System.out.println("The resultant amount is");
		System.out.println(ca);
		System.out.println(ei);
		System.out.println(interest);
		
		
	
	}
	

}
