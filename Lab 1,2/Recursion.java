import java.util.Scanner;

public class Recursion{
	public static void main(String[] args) {
	Scanner sc = new  Scanner(System.in);
		System.out.println("enter number :");

		int number = sc.nextInt();
		Recurs x=new Recurs();
		int ans = x.factorial(number);

		System.out.println("factorial is "+ans);
		sc.close();


		
	}
}
  class Recurs{
	
	static int factorial(int n)
	{
		if(n<=1)
		{
			return 1;
		}
	
			return n*factorial(n-1);
		
	}
}