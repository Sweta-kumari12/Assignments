package Q3;

import java.lang.Math;
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	return (principalAmount*time*interestRate)/100;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	return (principalAmount * Math.pow(1.0+interestRate/100.0,time) - principalAmount);

    }
}

public class Assignment1Q3 {
	public static void main (String args[]) {
		SiCi obj=new SiCi();
		System.out.println("Compound Interest "+Math.round(obj.compoundInterest(1000.0, 5, 4.0)));
		System.out.println("Simple Interest "+obj.simpleInterest(1000.0, 5, 4.0));
	}

}
