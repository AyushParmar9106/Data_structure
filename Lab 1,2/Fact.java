import java.util.Scanner;

public class Fact{
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter number to find factorial :");
		int number = sc.nextInt();
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
				System.out.println("factorial :"+ fact);

	}
}