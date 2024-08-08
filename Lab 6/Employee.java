import java.util.*;

class Employee_detail{
	double Employee_id;
	String Name;
	float Salary;

	void getdetail();
	void setdetail(); 
}

setdetail(){
	int x,y,z;
	System.out.println("enter id");
	double x= sc.nextdouble();
	System.out.println("enter name");
	String y=sc.nextline();
	System.out.println("enter salary");
	float z=sc.nextfloat();
}
getdetail(){
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
}


public class Employee{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee_detail emp = new Employee_detail();

		emp.getdetail();
		emp.setdetail();
	}
}