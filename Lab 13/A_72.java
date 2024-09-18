
import java.util.Scanner;

public class A_72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data=0;
        LinkedList li = new LinkedList();
        
        String s = "";
        while (!s.equals("-1")) { 
            System.out.println("Enter 1 to insert node at first position : ");
        System.out.println("Enter 2 to delete node at specific position : ");
        System.out.println("Enter 3 to insert node at last position : ");
        System.out.println("Enter 4 to display Doubly Linked List : ");
        System.out.println("Enter -1 to end the loop");
        s = sc.next();
            switch(s){
                case "1":
                System.out.println("Enter data : ");
                data = sc.nextInt();
                li.insertAtFirst(data);
                break;
                case "2":
                System.out.println("Enter data : ");
                data = sc.nextInt();
                li.deleteAtSpecific(data);
                break;
                case "3":
                System.out.println("Enter data : ");
                data = sc.nextInt();
                li.insertAtLast(data);
                break;
                case "4":
                li.display();
                break;
                case "-1":
                System.out.println("Exiting the loop");
                return;
            }
        }
    } 
}
