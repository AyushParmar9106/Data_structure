    import java.util.*;
    public class A_99 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] a = new int[10];
            System.out.println("enter size of element");
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                System.out.println("enter a ["+i+"]");
                a[i]=sc.nextInt();
            }

        int gap=0;
        for(gap=n/2;gap>=1;gap=gap/2)
        {
            for(int j=gap;j<n;j++)
                {
                    for(int i=j-gap;i>=0;i=i-gap)
                    {
                        if(a[i]<a[i+gap])
                        {
                            break;
                        }
                        else
                        {
                            int temp=a[i];
                            a[i]=a[i+gap];
                            a[i+gap]=temp;
                            
                        }

                    }
                }
        }

            for(int i=0;i<n;i++)
            {
            
                System.out.println(a[i]);
            
            }
        }

    }