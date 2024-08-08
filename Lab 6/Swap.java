import java.util.*;
public class Swap{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x,y;
		System.out.println("enter x");
		x= sc.nextInt();

		System.out.println("enter y");
		y= sc.nextInt();

		findswap(x,y);
	}

	public static void findswap(int x,int y){
		int t;
		t=x;
		x=y;
		y=t;

		System.out.println(x+" "+y);
	}
}