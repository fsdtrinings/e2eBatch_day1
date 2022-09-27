package day2;

public class TaxCalculator
{

	public static void main(String[] args) {
		
		
		int allSalary[] = new int[3];  // {7500,1515,5151};
		allSalary[0] = 75000;
		allSalary[1] = 175000;
		allSalary[2] = 7500;
		
		
		for(int x = 0; x < allSalary.length ; x++)
		{
			  // 1. extract the monthly salary from array 
			
			int monthlyGrossSalary =  allSalary[x];
			
			 // 2. convert monthly salary to annual salary 
			
			int annualSalary = monthlyGrossSalary*12;
			
			  // 3.  calculate HRA , DA and TA 
			int hra = (int)(annualSalary * 0.20);
			int da = (int)((annualSalary+hra) *  0.40);
			
			
			 // 4.  clculate annual taxable salary 
			
			int taxableSalary = annualSalary+hra+da;
			
			 // 5. calaculate tax 
			int tax = 0;
			if(taxableSalary<500000) {
				tax = 0;
			}
			if(taxableSalary>500001  && taxableSalary < 1000000) {
				tax = (int)(taxableSalary * 0.10 );
			}
			if(taxableSalary>1000001  && taxableSalary < 2000000) {
				tax = (int)(taxableSalary * 0.20 );
			}
			if(taxableSalary>2000000) {
				tax = (int)(taxableSalary * 0.30 );
			}
			System.out.println("\n-------------------------------------------\n");
			System.out.println(" Gross Salary : "+annualSalary);
			System.out.println(" HRA : "+hra);
			System.out.println(" DA : "+da);
			System.out.println(" Taxable Salary  : "+taxableSalary);
			System.out.println(" Tax : "+tax);
			System.out.println(" Net Salary  : "+(taxableSalary-tax));
			
			
			
			
		}//end of for 
		
	}//end of main
}//end of class
