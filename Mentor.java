package Session3Assignment3;

public class Mentor {
	String mentorname;
	String dept;
	public Mentor(String mname){
	 dept= "CS";
	 mentorname = mname;
	 System.out.println("Inside parent class constructor");
	}
   public void display(){
	   System.out.println("Inside parent class method");
	 System.out.println("Mentor name is " +mentorname);
	 System.out.println("Department is " +dept);
   }
	
}
