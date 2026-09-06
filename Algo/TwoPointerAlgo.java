import java.util.Scanner;

public class TwoPointerAlgo {

    // /* Question 6 ====> Container with most water */
    // static int maxWater(int[] arr) {
    // int left = 0; // Pointer starts from the first line
    // int right = arr.length - 1; // Pointer starts from the last line
    // int maxArea = 0; // Stores the maximum water area found so far
    // while (left < right) { // Continue until both pointers meet
    // int height = Math.min(arr[left], arr[right]); // Water height is limited by
    // the shorter line
    // int width = right - left; // Calculate the distance between the two lines
    // int area = height * width; // Calculate the amount of water between the two
    // lines
    // maxArea = Math.max(maxArea, area); // Store the larger value between current
    // area and maximum area
    // if (arr[left] < arr[right]) { // Check if the left line is shorter
    // left++; // Move left pointer forward to find a taller line
    // } else { // If the right line is shorter or both lines have the same height
    // right--; // Move right pointer backward to find a taller line
    // }
    // }
    // return maxArea; // Return the maximum water area
    // }

    // /* Question 5 ====> Move all zero to end */
    // static void moveAllZero(int[] arr) {
    // int i = 0; // Points to the position where the next non-zero element should
    // be placed
    // for (int j = 0; j < arr.length; j++) { // Traverse the complete array using j
    // if (arr[j] != 0) { // Check if the current element is non-zero
    // int temp = arr[j]; // Store the current non-zero element temporarily
    // arr[j] = arr[i]; // Put the element at position i into position j
    // arr[i] = temp; // Put the non-zero element into position i
    // i++; // Move i to the next position for a non-zero element
    // }
    // }
    // for (int x : arr) { // Traverse the array after moving all zeros
    // System.out.print(x + " "); // Print each element
    // }
    // System.out.println(); // Move to the next line
    // }

    // /* Question 4 ====> Remove Duplicates from an Sorted array */
    // static int removeDuplicate(int[] arr) {
    // if (arr.length == 0) { // Check if the array is empty
    // return 0; // Return 0 because there are no elements
    // }
    // int start = 0; // Points to the position of the last unique element
    // for (int end = 1; end < arr.length; end++) { // Traverse the array from the
    // second element
    // if (arr[end] != arr[start]) { // Check if the current element is different
    // from the last unique element
    // start++; // Move start to the next position for the new unique element
    // arr[start] = arr[end]; // Store the new unique element at the start position
    // }
    // }
    // return start + 1; // Return the count of unique elements
    // }

    // /* Question 3 ====> Palindrome Check <==== */
    // // /* =====> In case of Number or Integer <======= */
    // static boolean isPalindrome(int []arr){
    // int start = 0;
    // int end = arr.length - 1;
    // while(start < end){
    // if(arr[start] != arr[end]){
    // return false;
    // }
    // start ++;
    // end --;
    // }
    // return true;
    // }
    // // /* =====> In case of String <======= */
    // static boolean isPalindrome(String str){
    // int start = 0;
    // int end = str.length() - 1;
    // while(start < end){
    // if(str.charAt(start) != str.charAt(end)){
    // return false;
    // }
    // start ++;
    // end --;
    // }
    // return true;
    // }

    // /* Question 2 ====> Reverse an Array <==== */
    // static void reverse(int[] arr) {
    // int left = 0; // Points to the first element of the array
    // int right = arr.length - 1; // Points to the last element of the array
    // while (left < right) { // Continue until left and right pointers meet
    // int temp = arr[left]; // Store the left element temporarily
    // arr[left] = arr[right]; // Put the right element at the left position
    // arr[right] = temp; // Put the original left element at the right position
    // left++; // Move left pointer one step forward
    // right--; // Move right pointer one step backward
    // }
    // System.out.println("Array after reversal ...."); // Print a message before
    // displaying the reversed array
    // for (int num : arr) { // Traverse through each element of the array
    // System.out.print(num + " "); // Print the current element
    // }
    // System.out.println(); // Move the cursor to the next line
    // }

    // /* Question 1 ====> Pair sum to target <==== */
    // static boolean pairSum(int[] arr, int target) {
    // int left = 0; // Pointer starts from the first element
    // int right = arr.length - 1; // Pointer starts from the last element
    // while (left < right) { // Continue until both pointers meet
    // int sum = arr[left] + arr[right]; // Calculate the sum of the two elements
    // if (sum == target) { // Check if the sum is equal to the target
    // System.out.println("Pair : " + arr[left] + ", " + arr[right]); // Print the
    // pair
    // return true; // Return true because the required pair is found
    // }
    // if (sum < target) { // If the current sum is smaller than the target
    // left++; // Move left pointer forward to increase the sum
    // } else { // If the current sum is greater than the target
    // right--; // Move right pointer backward to decrease the sum
    // }
    // }
    // return false; // Return false if no pair with the target sum is found
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // /* Question 1 ====> Pair sum to target <==== */
        // int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9 }; // Create a sorted integer array
        // System.out.print("Enter your target : "); // Ask the user to enter the target
        // sum
        // int target = sc.nextInt(); // Read the target value from the user
        // System.out.println(pairSum(arr, target)); // Call pairSum() and print the
        // result

        // /* Question 2 ====> Reverse an Array <==== */
        // int[] arr = { 1, 2, 5, 6, 7, 8, 9 }; // Create an integer array
        // System.out.println("Array before reversal ..."); // Print a message before
        // reversal
        // for (int num : arr) { // Traverse through every element of the array
        // System.out.print(num + " "); // Print each element
        // }
        // System.out.println(); // Move to the next line
        // reverse(arr); // Call the reverse method and pass the array

        // /* Question 3 ====> Palindrome Check <==== */
        // // /* =====> In case of Number or Integer <======= */
        // int [] arr = {1,1,2,3,1};
        // System.out.println("Palindrome : "+ isPalindrome(arr));
        // // /* =====> In case of String <======= */
        // String str = "madaam";
        // System.out.println("Palindrome : " + isPalindrome(str));

        // /* Question 4 ====> Remove Duplicates from an Sorted array */
        // int[] arr = { 1, 1, 2, 2, 3, 3 }; // Create a sorted array containing
        // duplicate elements
        // System.out.println("Original array ....!"); // Print a message for the
        // original array
        // for (int x : arr) { // Traverse through every element of the array
        // System.out.print(x + " "); // Print each element of the original array
        // }
        // System.out.println(); // Move to the next line
        // System.out.println("After remove duplicates ....!"); // Print a message
        // before displaying the result
        // int n = removeDuplicate(arr); // Call removeDuplicate() and store the new
        // length
        // for (int k = 0; k < n; k++) { // Loop only through the unique elements
        // System.out.print(arr[k] + " "); // Print each unique element
        // }
        // System.out.println(); // Move to the next line

        // /* Question 5 ====> Move all zero to end */
        // int[] arr = { 0, 1, 0, 2, 0, 3, 4 }; // Create an array containing zeros and
        // non-zero elements
        // moveAllZero(arr); // Call the method to move all zeros to the end

        // /* Question 6 ====> Container with most water */
        // int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 }; // Create an array representing
        // the heights of vertical lines
        // System.out.println("Max Water ==> " + maxWater(arr)); // Call maxWater() and
        // print the maximum water area

        // /* Question 7 ====> Three Sum problem */
        int [] arr = {2,3,5,6,7,9};
        System.out.println();
        sc.close();
    }
}
