package School_management_system;

public class student {
   private int id;
   private String name;
   private int grade;
   private int feespaid;
   private int feestotal;
   public student(int id,String name,int grade) {
	   this.feespaid=0;
	   this.feestotal=30000;
	   this.id=id;
	   this.name=name;
	   this.grade=grade;
   }
   public void setgrade(int grade) {
	   this.grade=grade;
   }
   public void updatefeespaid(int fees){
	   feespaid+=fees;
   }
   
  public int getid() {
	  return this.id;
  }
  public String getname() {
	  return this.name;
  }
  public int getgrade() {
	  return this.grade;
  }
  public int getfeespaid() {
	  return this.feespaid;
  }
  public int getfeestotal() {
	  return feestotal;
  }




   }

