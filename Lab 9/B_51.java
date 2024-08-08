import java.util.Scanner;
class Circle_QueueDemo{
	int size;
    int[] QueueArray;

    public  Circle_QueueDemo(int size) {
        this.size = size;
         QueueArray = new int[size];
    }
      int front = -1, rear = -1;

      public void Enque(int x)
      {
      		System.out.println("------------------->" + rear);
	      	if(rear==size-1)
		      	{
		      		if(front==0)
		    		{
		    	 		
				    	System.out.println("Queue is overflow");
				    	return;
		   			}
		      		rear=0;
		      		System.out.println("--------------");

		      	}
	      	else
		      	{
		      		rear++;
		      	}


		    QueueArray[rear]=x;

		    if(front==-1){
		    	front = 0;
		    	return;
		    }

      }
      public int Deque()
      {
      	if(front==-1)
      	{
      		System.out.println("Queue is underflow");
      		return 0;
      	}
      	int x = QueueArray[front];
 
      	if(front==rear)
      	{
      		front=-1;
      		rear=-1;
      		return x;
      	}
      	if(front==size-1)
      	{
      		front=0;
      	}
      	else
      	{
      		front++;
      	}
      	return x;
      }

       public void display() {
        // if (front == -1) {
        //     System.out.println("Queue Is Empty");
        //     return;
        // }
     
     
      if (front!=-1) {
        int i = front;
        do {
             System.out.println("front-------"+front);
              System.out.println("rear--------"+rear);
            System.out.println(QueueArray[i]);
            if(i==rear)
                break;
            i = (i + 1) % (QueueArray.length);

        } while (i != front);
    }
  }


}

public class B_51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size Of Queue : ");
        int n=sc.nextInt();
        Circle_QueueDemo q1=new Circle_QueueDemo(n);

        while (true) {
            System.out.println("Enter Digit For Perform Below Operatio");
            System.out.println("1 for Enqueue()");
            System.out.println("2 for Dequeue()");
            System.out.println("3 for Display()");
            System.out.println("4 for Exit");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Element For insert : ");
                    int x=sc.nextInt();
                    q1.Enque(x);
                    break;
                case 2:
                    System.out.println("Removed Element : "+q1.Deque());
                    break;
                case 3:
                    q1.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
            
                default:
                System.out.println("Enter Valid Digit");
                    break;
            }
        }
    }
}