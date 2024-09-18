import java.util.*;
public class A_91{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter a ["+i+"]");
			a[i]=sc.nextInt();
		}

		int mid=(a.length-0)/2;
		int start=0;
		System.out.println("enter element to find");
		int n=sc.nextInt();
		int end = a.length-1;

		while(start<=end){
			if(a[mid]==n){
				System.out.println("your element at:"+mid);
				return; 
			}
			else if(a[mid]>n){
				start=start;
				end=mid-1;
			}
			else if(a[mid]<n){
				start = mid+1;
				end=end;
			}
			mid=(start+end)/2;
		}
		System.out.println("element not found");
	}
}