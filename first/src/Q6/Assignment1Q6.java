package Q6;
import java.util.Scanner;
class Login{
    
    public boolean loginUser(String user, String pass) {
    	String userId = "Ajay",password = "password";
 
    return user.equals(userId) && pass.equals(password);
    }

}

public class Assignment1Q6 {
	public static void main(String[] args) {
		int max_attempts=3,attempt=0;
		Scanner sc=new Scanner(System.in);
		while(attempt<max_attempts) {
			System.out.println("Enter userid");
			String userid=sc.nextLine();
			System.out.println("Enter password");
			String password=sc.nextLine();
			
			Login obj=new Login();
			if(obj.loginUser(userid, password)) {
				System.out.println("Welcome"+ userid);
				return;
			}
			else {
				if(attempt!=3) {
				System.out.println("Invalid credential ,please try again");
				}
				attempt++;
			}
		}
		System.out.println("contact admin");
		
			}


}
