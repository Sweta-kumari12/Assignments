package Q1;
import java.util.Scanner;
class ArmstrongOrNot {
    public boolean armstrongCheck(int n) {
    	int temp, digits=0, last=0, sum=0;
    	temp=n;   
    	 
    	while(temp>0)    
    	{   
    	temp = temp/10;   
    	digits++;   
    	}   
    	temp = n;   
    	while(temp>0)   
    	{   

    	last = temp % 10;   

    	sum +=  (Math.pow(last, digits));   

    	temp = temp/10;   
    	}  

    	if(n==sum)   
    	  
    	return true;      
    	else return false;   
    }

}
public class Assignment1Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find armstrong");
		int num=sc.nextInt();
		
		ArmstrongOrNot obj=new ArmstrongOrNot();
		sc.close();
		if(obj.armstrongCheck(num))  
		{  
		System.out.print("Armstrong ");  
		}  
		else   
		{  
		System.out.print("Not Armstrong ");  
		}  
		}   
	}


