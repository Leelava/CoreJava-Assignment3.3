//Uses Super , this keywords with constructors and methods.
package Session3Assignment3;

public class Student extends Mentor{
 int stdid;
 String stdname;
	
 public Student(int id,String std1, String std2){
	 super(std1);//calling parent class constructor
	 this.stdid = id;
	 this.stdname=std2;
	 System.out.println("Inside child class constructor");
 }
 public void display(){
	 super.display();//calling parent class method
	 System.out.println("Inside child class method");
	 System.out.println("Student id is " +stdid);
	 System.out.println("Student name is " +stdname);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a1= new Student(20,"Shashi","Murthy");
		a1.display();
		Student a2 = new Student(21,"Ravi","Amit");  
        a2.display();
	}

}
