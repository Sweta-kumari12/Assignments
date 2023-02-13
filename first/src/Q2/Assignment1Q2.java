package Q2;

import java.util.ArrayList;
import java.util.List;
class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
    	List<Integer>a=new ArrayList<>();
    	for(int i=min;i<=max;i++) {
    	int temp, digits=0, last=0, sum=0;     
    	temp=i;     
    	while(temp>0)    
    	{   
    	temp = temp/10;   
    	digits++;   
    	}   
    	temp = i;   
    	while(temp>0)   
    	{   

    	last = temp % 10;   

    	sum +=  (Math.pow(last, digits));   

    	temp = temp/10;   
    	}  
    	if(i==sum)  
    	{
    	 a.add(i);
    	}
    	
       }
     return a.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class Assignment1Q2 {
	public static void main (String [] args) {

	       int min = 100;int max = 999;
	       
	       
	       ArmstrongNumBetweenRange obj=new ArmstrongNumBetweenRange();
	       int []a=obj.armstrongNumbersInRange(min,max);
	       for(int i=0;i<a.length;i++) {
	    	   System.out.print(a[i]+" ");
	       }
	    }

}
