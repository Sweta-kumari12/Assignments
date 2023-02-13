package Assignment2;
class SingletonInheritanceCheck{
	private static SingletonInheritanceCheck singelton=new SingletonInheritanceCheck();
	private SingletonInheritanceCheck() {
		
	}
	public static SingletonInheritanceCheck getinstance() {
		System.out.println("Instance of singleton is creating");
		return singelton;
	}
	public void demo() {
		System.out.println("Completed");
	}
}
public class Assignment2Q1 {
  public static void main(String[] args) {
	  SingletonInheritanceCheck temp=SingletonInheritanceCheck.getinstance();
	  temp.demo();
	  
}
	
}

