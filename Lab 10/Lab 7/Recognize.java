import java.util.*;
public class Recognize{

	public static boolean Recognize(String str){
		Stack<Character> s=new Stack<Character>();
		int index=0;

		char next =str.charAt(index);

		while(next!='c'){
			if(next==' '){
				return false;
			}
			s.push(next);
			index++;
			next = str.charAt(index);
		} 
		index++;
		while(!s.isEmpty() && s.peek()!='c' && index<str.length()){
			next = str.charAt(index);
			if(next!=s.pop()){
				return false;
			}
			index++;
		}
		next = str.charAt(index-1);
		if(!s.isEmpty() && next!=' ' && s.peek()!='c'){
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.println("enter A string");
		String str = sc.nextLine();

		if(Recognize(str)){
			System.out.println("String is valid");
		}
		else{
			System.out.println("string is invalid");
		}
	}
}