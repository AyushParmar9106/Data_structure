import java.util.Scanner;


class Node {
    int key;
    Node left; 
    Node right;
    public Node(int item) {
        key = item;
        left = right = null;
    }
}
class BinarySearchTree {
    Node root;
    public void insert(int value) {
      Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }

       Node current = root;
        Node parent = null;

        while (true) {
            parent = current;
            if (value < current.key) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }
    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.key + " ");
            inorderTraversal(node.right);
        }
    }
    public void printInorder() {
        inorderTraversal(root);
        System.out.println();
    }
}
public class A_77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        System.out.println("Enter the number of elements you want to insert:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            bst.insert(value);
        }

        System.out.println("In-order traversal of the BST:");
        bst.printInorder();

        scanner.close();
    }
}
