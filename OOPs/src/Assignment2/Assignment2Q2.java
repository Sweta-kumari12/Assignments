package Assignment2;
import java.util.ArrayList;
class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary+overtime;
    }
}

public class Assignment2Q2 {
	 int salary = 10000;
	    public int getSalary(int salary){
	    	return salary;
	    }
	    public  int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
	    	int total=0;
	    	for(int employeeSalary: employeeSalaries) {
	    		total=total+employeeSalary;
	    	}
	    	return total;
	    }
	    public static void main(String[] args) {
	    	ArrayList<Integer> employeeSalaries = new ArrayList<>();
	    Assignment2Q2 obj1=new Manager();
	    employeeSalaries.add(obj1.getSalary(10000));
	   
	    Assignment2Q2 obj2=new Labour();
	    employeeSalaries.add(obj2.getSalary(10000));
	    int total=obj1.totalEmployeesSalary(employeeSalaries);
	    System.out.println(total);

}
}
