import java.util.*;
public class A_90
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter a ["+i+"]");
			a[i]=sc.nextInt();
		}
		System.out.println("enter a element to find ");
		int n=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.println("your element at:"+i);
				return;
			}
			

		}
		System.out.println("No elements were found");
	}
}