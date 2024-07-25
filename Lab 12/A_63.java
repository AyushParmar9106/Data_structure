import java.util.Scanner;


class Node {
    int data;
    Node next;
    
  
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class LinkedList {
    Node head; 
    

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        
        last.next = newNode;
    }
    

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
   
    public LinkedList copy() {
        LinkedList newList = new LinkedList();
        
        Node original = this.head;
        Node newHead = null;
        Node newTail = null;
        
        while (original != null) {
            Node newNode = new Node(original.data);
            
            if (newHead == null) {
                newHead = newNode;
                newTail = newNode;
            } else {
                newTail.next = newNode;
                newTail = newNode;
            }
            
            original = original.next;
        }
        
        newList.head = newHead;
        return newList;
    }
}


public class A_63{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        
        
        System.out.print("Enter number of elements in the linked list: ");
        int n = scanner.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            list.insert(data);
        }
        
        System.out.print("Original Linked List: ");
        list.printList();
        
    
        LinkedList copiedList = list.copy();
        
        System.out.print("Copied Linked List: ");
        copiedList.printList();
        
        scanner.close();
    }
}

