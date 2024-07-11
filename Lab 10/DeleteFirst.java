class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;
                                
    public LinkedList() {
        this.head = null;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        head = head.next;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
}

public class DeleteFirst{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
   

       
        list.insertFirst(3);
        list.insertFirst(7);
        list.insertFirst(1);

        System.out.println("Original list:");
        list.display();

        list.deleteFirst();

        System.out.println("List after deleting first node:");
        list.display();
    }
}
