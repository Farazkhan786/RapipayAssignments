package p1;

import java.util.Scanner;
public class UserCode {
	public static void main(String[] args) {
		
		userFormToEnterSalary();
		
	}
	public static void userFormToEnterSalary() {
		Scanner sc=new Scanner(System.in);
		BusinessOperation server = new BusinessOperation(); 
		System.out.println("Enter Basic salary");
		int basicSalary=sc.nextInt();
		server.calculateTax(basicSalary*12);
		
	}
	
	public static void printSalaryBreakUp() {
		System.out.println("Basic Salary");
		System.out.println("HRA :-");
		System.out.println("DA :-");
		System.out.println("Gross Salary");
		System.out.println("Tax Amount :-");
		System.out.println("Net Salary :-");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
