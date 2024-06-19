import java.util.Scanner;
public class Array1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter number of length");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter element");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("new element");
		for(int i=0;i<n;i++){

			System.out.println(arr[i]);
		}
	}
}