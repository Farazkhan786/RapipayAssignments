package p1;

public class BusinessOperation {
	 
	public void calculateTax(int basicSalary) {
		float hra = getHRA(basicSalary);
		float da = getDA(basicSalary);
		float grossSalary= basicSalary+hra+da;
		float tax=getTax(grossSalary);
		
		System.out.println("Basic Salary"+basicSalary);
		System.out.println("HRA :-"+hra);
		System.out.println("DA :-"+da);
		System.out.println("Gross Salary"+grossSalary);
		System.out.println("Tax Amount :-"+tax);
		System.out.println("Net Salary :-"+(grossSalary-tax));
			
	}
	
	public float getHRA(int basicSalary) {
		float hra=0;
		hra=basicSalary*0.15f;
		return hra;
		
	}
	public float getDA(int basicSalary) {
		float daAmount=0;
		daAmount=basicSalary*0.6f;
		return daAmount;
	}
	public float getTax(float grossSalary) {
		float taxAmount=0;
		if(grossSalary>500000&&grossSalary<=1000000)
		{
			taxAmount= grossSalary*0.20f;
		}
		return taxAmount;
		
	}

}
