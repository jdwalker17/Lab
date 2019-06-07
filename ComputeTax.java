import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		Scanner Jeffy = new Scanner(System.in);
		System.out.println("enter your name: ");
		String name = Jeffy.nextLine();
		
		
		//variables
		double income,tax10 =0.1,tax15=0.15,tax25=0.25,totalTax=0;
		double p1= 8350,p2=33950;
		double married1 = 16700, married2 = 67900;
		
		
		System.out.println(name+ ","+ "enter your filing status (1- single; 2- married): ");
		int status = Jeffy.nextInt();
		
		// single 
		if(status==1) {
			System.out.println("enter taxable income");
			income = Jeffy.nextDouble();
			
			if(income>0&&income<8350) {
				
				totalTax=income*tax10;
				System.out.println(name +" you pay back: " +totalTax);
				System.out.println("PartI: "+ totalTax);
			}
			
			else if(income>8350&&income<=33950) {
				
				double totalTax10=p1*tax10;
				double totalTax15 = (income-p1)*tax15;
				totalTax+= totalTax10+totalTax15;
				System.out.println(name +" you pay back: " +totalTax);
				System.out.println("PartI: " +totalTax10);
				System.out.println("PartII: "+ totalTax15);
			}
			
			else  {
				
				double totalTax10=p1*tax10;
				double totalTax15 = (p2-p1)*tax15;
				double totalTax25 = (income-p2)*tax25;
				totalTax= totalTax10+totalTax15+totalTax25;
				System.out.println(name +" you pay back: " +totalTax);
				System.out.println("PartI: " +totalTax10);
				System.out.println("PartII: "+ totalTax15);
				System.out.println("PartIII: "+ totalTax25);
				
			}
		}
			
		
		
		//married
		else if(status==2) {
			System.out.println("enter taxable income");
			income = Jeffy.nextDouble();
			
			if(income>0&&income<16700) {
				
				totalTax=income*tax10;
				System.out.println(name +" you pay back: " +totalTax);
				System.out.println("PartI: "+ totalTax);
			}
			
			else if(income>16700&&income<=67900) {
				
				double totalTax10=married1*tax10;
				double totalTax15 = (income-married1)*tax15;
				totalTax+= totalTax10+totalTax15;
				System.out.println(name +" you pay back: " +totalTax);
				System.out.println("PartI: " +totalTax10);
				System.out.println("PartII: "+ totalTax15);
			}
			
			else  {
				
				double totalTax10=married1*tax10;
				double totalTax15 = (married2-married1)*tax15;
				double totalTax25 = (income-married2)*tax25;
				totalTax+= totalTax10+totalTax15+totalTax25;
				System.out.println(name +" you pay back: " +totalTax);
				System.out.println("PartI: " +totalTax10);
				System.out.println("PartII: "+ totalTax15);
				System.out.println("PartIII: "+ totalTax25);
				
			}
		}
			
		
		
		else {
			System.out.println("illegal status: "+ status);
		}
		
		
	}

}
