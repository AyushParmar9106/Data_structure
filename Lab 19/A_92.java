import java.util.Scanner;

public class A_92
{
    public static void main(String[] args) 
    {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of element");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
        {
			System.out.println("enter a ["+i+"]");
			a[i]=sc.nextInt();
		}

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
		System.out.println(a[i]);
		}
    }
}