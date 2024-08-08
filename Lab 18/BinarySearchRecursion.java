import java.util.*;


public class BinarySearchRecursion {

 
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

         
            if (arr[mid] == target) {
                return mid;
            }

         
            if (arr[mid] > target) {
                return binarySearch(arr, left, mid - 1, target);
            }

           
            return binarySearch(arr, mid + 1, right, target);
        }

       
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

     
        Arrays.sort(arr);

       
        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        int result = binarySearch(arr, 0, arr.length - 1, target);

     
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }

        sc.close();
    }
}
