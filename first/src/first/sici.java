package first;
import java.util.Scanner;  
import java.lang.Math;  
public class sici {
	  static double simpleInterest(double principalAmount,int t,double interestRate){
		 return (principalAmount*t*interestRate)/100;
	 }
	     static double  compoundInterest(double principalAmount,int t,double interestRate){
	    	return (principalAmount * Math.pow(1.0+interestRate/100.0,t) - principalAmount);


	    }
	    public static void main (String args[]) {
	    	double p,r,n;
	    	int t;
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter principal amount");
	    	p=sc.nextDouble();
	        System.out.println("Enter rate");
	    	r=sc.nextDouble();
	    	System.out.println("Enter Number of years interest is applied");
	    	t=sc.nextInt();
	    	System.out.println("Enter Term of loan, in years");
	    	n=sc.nextDouble();
	    	sc.close();
	    	double d=compoundInterest(p,t,r);
	    	double e=simpleInterest(p,t,n);
	    	System.out.println("compound interest"+d+" ,");
	    	System.out.println("simple interest"+e+",");
	    	}
		
	    

}
