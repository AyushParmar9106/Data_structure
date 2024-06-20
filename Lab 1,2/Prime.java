import java.util.Scanner;
public class Prime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag=0;
		System.out.println("write a number");
		int a = sc.nextInt();
		for(int i=2;i<=(int)a/2;i++){
			if(a%i==0){
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.println("number is not prime");
		}
		else{
			System.out.println("number is prime");
		}
	}
}