
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Circular_Linked_List {
    Node first = null;
    Node last = null;

    public void InsertFirst(int data) {
        Node temp1 = new Node(data);
        if (first == null) {
            first = last = temp1;
            last.next = first;
        }
        temp1.next = first;
        first = temp1;
        last.next = first;
    }

    public void Insertend(int data) {
        Node temp2 = new Node(data);
        if (last == null) {
            last = first = temp2;
            first.next = last;
        }
        temp2.next = last;
        last = temp2;
        first.next = last;
    }

    public void insertPos(int data,int pos){
        Node save = first;
        int count = 1;
        Node temp3 = new Node(data);
        while (count<pos-1) {
            save = save.next;
            count++;
        }
        temp3.next=save.next;
        save.next=temp3;
       

    }

    public void display() {
        Node save = first;
        while (save.next != first) {
            System.out.print(save.data + "->");
            save = save.next;
        }
        System.out.println(save.data);
    }

}

public class A_71 {
    public static void main(String[] args) {
        Circular_Linked_List s = new Circular_Linked_List();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter 1 to insert at first:");
            System.out.println("enter 2 to insert at last:");
            System.out.println("enter 3 to insert at position:");
            System.out.println("enter 4 to display:");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter data:");
                    int data = sc.nextInt();
                    s.InsertFirst(data);
                    break;
                case 2:
                    System.out.println("enter data:");
                    int data1 = sc.nextInt();
                    s.Insertend(data1);
                    break;
                case 3:
                    System.out.println("enter pos");
                    int pos=sc.nextInt();
                    System.out.println("enter data to enter");
                    int data2 = sc.nextInt();
                    s.insertPos(data2,pos);
                    break;
                case 4:
                    s.display();
            }
        }
    }
}