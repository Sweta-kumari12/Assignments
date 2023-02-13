package Q4;
import java.util.Scanner;
class ResultDeclaration{
	public String declareResults(double subject1Marks,double subject2Marks,double subject3Marks) {
		String result="";
		if(subject1Marks+subject2Marks+subject3Marks>60) {
			result="pass";
			return result;
		}
		if(subject1Marks>60||subject2Marks>60||subject3Marks>60) {
			if(subject1Marks+subject2Marks<60|| subject2Marks+subject3Marks<60||subject3Marks+subject1Marks<60) {
				result="fail";
				return result;
			}
		}
		if(subject1Marks+subject2Marks>60|| subject2Marks+subject3Marks>60||subject3Marks+subject1Marks>60) {
			result=("pass"+" "+"promote");
			return result;
		}
		
		result="fail";
		return result;
		
	}
}
public class Assignment1Q4 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter test cases");
		int t=sc.nextInt();
		while(t!=0) {
			System.out.println("Enter marks of first subject");
			double a=sc.nextDouble();
			System.out.println("Enter marks of second subject");
			double b=sc.nextDouble();
			System.out.println("Enter marks of third subject");
			double c=sc.nextDouble();
			ResultDeclaration obj=new ResultDeclaration();
			System.out.println(obj.declareResults(a,b,c));
			t--;
		}
		sc.close();
	}
}

