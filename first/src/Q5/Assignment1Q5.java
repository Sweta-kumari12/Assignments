package Q5;

import java.util.Scanner;


class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	if(ctc>0 && ctc< 180000) {
    		return 0;
    	}
    	else if(ctc>181001 && ctc<300000) {
    	   return  (ctc*0.10);
       }
    	else if(ctc>300000 && ctc<500000) {
    	   return  (ctc*0.20);
       }
    	else {
    		return  (ctc*0.30);
    	}
	
    }
}

public class Assignment1Q5 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ctc");
	int ctc=sc.nextInt();
	sc.close();
	TaxAmount obj=new TaxAmount();
	System.out.println(obj.calculateTaxAmount(ctc));
	}
}
