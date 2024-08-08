import java.util.*;

class Student_detail{
	double Enrollment_no;
	String name;
	Int sem;
	Float cpi;

void setdetail();
void getdetail();
}

setdetail(){
	int w,x,y,z;
	for(int i=0;i<5;i++){
		System.out.println("enter "+i+"Number of student");
		System.out.println("enter Eno");
		double w=sc.nextdouble();

		System.out.println("enter name");
		String x=sc.nextLine();

		System.out.println("enter sem");
		int y=sc.nextInt();

		System.out.println("enter cpi");
		float z=sc.nextFloat();
	}
}
	getdetail(){
		for(int j=0;j<5;j++){
			System.out.println(w);
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
	}
 public class Student{
 	public static void main(String[] args) {
 		Scanner sc=new Scanner(System.in);

 		Student_detail stu[] = new Student_detail(5);
 		 stu.getdetail();
 		 stu.setdetail();
 	}
 }