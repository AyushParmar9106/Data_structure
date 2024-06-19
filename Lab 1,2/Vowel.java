import java.util.Scanner;
public class Vowel{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a charcter");

		char ch=sc.next().charAt(0);
		if((ch=='a') || (ch=='e') || (ch=='o') || (ch=='i') || (ch=='u') || (ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U')){
			System.out.println("char is vowel");
		}
		else{
			System.out.println("char is constent");
		}
	}
}