import java.util.Scanner;
public class Area{
	public static void main(String[] args) {
		System.out.println("enter radious :");
		Scanner sc = new  Scanner(System.in);
		int radious;
		radious = sc.nextInt();
		System.out.println("area="+ Math.PI*radious*radious);

	}
}