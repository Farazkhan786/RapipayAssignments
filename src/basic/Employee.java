package basic;
import java.util.*;
public class Employee {
	String name;
	char gender;
	double yearsOfExp;
	String designation;
	double basicSalary;
	String status;
	public double promoteEmp() {
		if(this.designation=="ASE")
		{
			this.designation="ITA";
			this.basicSalary+=this.basicSalary*0.05;
		}
		else if(designation=="ITA")
		{
			this.designation="AST";
			this.basicSalary+=this.basicSalary*0.08;
		}
		else if(designation=="AST")
		{
			this.designation="ASC";
			this.basicSalary+=this.basicSalary*0.1;
		}
		return basicSalary;
		
	}
	public void applyForLWP() {
		this.status="InActive";
		this.basicSalary=0.0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getYearsOfExp() {
		return yearsOfExp;
	}
	public void setYearsOfExp(double yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
