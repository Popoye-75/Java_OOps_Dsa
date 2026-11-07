import java.util.Scanner;

public class OnlyDsaBinaySearch_10 {
    
    // /* Question 3 ---> Find first and last occurances of target */
    public static int [] firstLastOccur(int [] arr,int target){
        int first=-1,last = -1 ,low=0 ,high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low )/2;
            if(arr[mid] == target){
                first = mid;
            }else if(arr[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return new int[] {first,last};
    }

    // /* Question 2 ---> Find position where element inserted */
    public static int positionInsert(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    // /* Question 1 ---> Find the index of target element */
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // /* Question 1 --> Implement Binary Search */
        // int[] arr = { 2, 3, 5, 7, 9, 10, 15, 20 };
        // System.out.print("Enter your number do you want : ");
        // int x = sc.nextInt();
        // int idx = binarySearch(arr, x);
        // if (idx != -1) {
        // System.out.println("Element found at : " + idx);
        // } else {
        // System.out.println("Element not found ...!");
        // }

        // /* Question 2 ---> Find position where element inserted */
        // int[] arr = { 10, 20, 30, 40, 60 };
        // int result = positionInsert(arr, 7);
        // System.out.println("Element inserted at Idx : " + result);

        // /* Question 3 ---> Find first and last occurances of target */
        int [] arr = {1,2,2,3,4,4,5};
        int []result = firstLastOccur(arr, 4);
        for(int x : result){
            System.out.print(x+" ");
        }
        System.out.println();
        sc.close();
    }
}
