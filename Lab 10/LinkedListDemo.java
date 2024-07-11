class LinkedListDemo {

    class Node {

        int info;
        Node link;

        public Node(int info) {

            this.info = info;
            this.link = null;
        }
    }

    public Node first = null;

    public void insertAtFirst(int info) {

        Node newNode = new Node(info);

        newNode.link = first;
        first = newNode;
    }

    public void insertAtLast(int info) {

        Node newNode = new Node(info);

        if( first == null ){

            first = newNode;

            return;
        }

        Node save = first;

        while ( save.link != null ) {

            save = save.link;
        }

        save.link = newNode;
    }

    public void insertInOrder(int info) {

        Node newNode = new Node(info);

        if ( first == null || newNode.info <= first.info ) {

            newNode.link = first;
            first = newNode;

            return;
        }

        Node save = first;

        if( save.link != null && newNode.info >= save.info ){
            
            save = save.link;
        }

        newNode.link = save.link;
        save.link = newNode;
    }

    public void displayNode( LinkedListDemo l ){

        if( first == null ){

            System.out.println("Linked List Is  Empty");
        }
        
        Node save = l.first;

        while( save != null ){

            System.out.print(save.info);
            
            if( save.link != null ){

                System.out.print(" -> ");
            }

            save = save.link;
        }
        
        System.out.println();
    }

    public void deleteNode(int info){

        if( first == null ){

            System.out.println("Linked List Is Empty");
            return;
        }

        if( first.info == info ){

            first = first.link;

            return;
        }

        Node save = first;

        while( save.link != null && save.link.info != info ){

            save = save.link;
        }

        if( save.link == null ){

            System.out.println("Node Not Found");
            return;
        }

        save.link = save.link.link;
    }

    public void countNode(){
        
        Node save = first;
        int count = 0;

        while( save != null ){

            save = save.link;
            count++;
        }

        if( count == 0 ){

            System.out.println("LinkedList Is Empty");
        }
        else{

            System.out.println("LinkedList Nodes Is " + count );
        }
    }

    public void copyLinkedList(){

        if( first == null ){

            System.out.println("Linked List Is Empty");
            return;
        }

        Node save = first;
        
        LinkedListDemo node = new LinkedListDemo();
        node.first = new Node(save.info);
        Node saveCopy = node.first;

        save = save.link;

        while( save != null ){

            saveCopy.link = new Node(save.info);
            // node.insertAtLast(save.info);
            saveCopy = saveCopy.link;
            save = save.link;
        }

        displayNode(node);
    }

    public void reverseLinkedList(){

        if( first == null ){

            System.out.println("Linked List Is Empty");
            return;
        }

        // Node save = first;       
    }

    public void sortLinkedList(){

        Node save = first;

        if( save.link.info < save.info ){

            
        }
    }
}