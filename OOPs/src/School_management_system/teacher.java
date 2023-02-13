package School_management_system;

public class teacher {
   private int id;
   private String name;
   private int salary;
   public teacher(int id,String name,int salary) {
	   this.id=id;
	   this.name=name;
	   this.salary=salary;
   }
   public int getid() {
	   return this.id;
   }
   public String getname() {
	   return this.name;
   }
   public int getsalary() {
	   return this.salary;
   }
   public void setsalary(int salary) {
	   this.salary=salary;
   }
}
