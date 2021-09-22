package basic;
import java.util.Scanner;
public class WeeklySalary {
	float hr_pay;
	int hr_reg;
	int hr_over;
	public void getData() {
		Scanner sc=new Scanner(System.in);
		hr_reg=sc.nextInt();
		hr_over=sc.nextInt();
	}
	public void calculateSalary() {
		hr_pay=(hr_reg*500)+(hr_over*750);
		
		
	}
	public void display()
	{
		System.out.println("Weekly pay is:"+hr_pay);
		
	}
	public static void main(String []args) {
		WeeklySalary obj=new WeeklySalary();
		obj.getData();
		obj.calculateSalary();
		obj.display();
	}

}
