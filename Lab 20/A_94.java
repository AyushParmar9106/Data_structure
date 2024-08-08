import java.util.Scanner;
public class A_94
{    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("enter size of element");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
        {
			System.out.println("enter a ["+i+"]");
			a[i]=sc.nextInt();
		}
        int min_index = 0;
        for(int i=0;i<n-1;i++)
        {
            min_index = i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[min_index]){
                    min_index = j;
                }
            }

           if(min_index!=i){
                int temp = a[min_index];
                a[min_index] = a[i];
                a[i]=temp;
            }
        }
        System.out.println("<===========================>");
        for(int i=0;i<n;i++)
        {
           
			System.out.println(a[i]);
           
		}
     
    }
}