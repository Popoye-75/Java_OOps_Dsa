// import java.util.HashMap;

public class JavaYtDsa_1 {
	// /* Question 5 --> Chocolate Distribution Problem */
	static void chocolateDist(int arr[]) {
		System.out.println("This is chocolate distribute");
	}

	// /* Question 4 --> Contains Duplicate */
	// /* Method 1 ==> Brute force (Time & space --> O(n^2) and O(1)) */
	// static boolean containsDuplicate(int []arr){
	// for(int i = 0; i < arr.length; i++){
	// int curr = arr[i];
	// for(int j = i+1; j < arr.length; j++){
	// if(curr == arr[j]){
	// return true;
	// }
	// }
	// }
	// return false;
	// }
	// /* Method 2 ==> Optimized approach (Time & space --> O(n) and O(n)) */
	// static boolean containsDuplicate(int[] arr) {
	// HashMap<Integer, Integer> map = new HashMap<>();
	// for (int i = 0; i < arr.length; i++) {
	// if (map.containsKey(arr[i])) {
	// return true;
	// }
	// map.put(arr[i],i);
	// }
	// return false;
	// }

	// /* Question 3 --> Maximum SubArray */
	// static int maximumSubArray(int []arr){
	// int sum = arr[0];
	// int maxSum = arr[0];
	// for(int i = 1; i < arr.length; i++){
	// sum = Math.max(sum , sum + arr[i]);
	// maxSum = Math.max(sum, maxSum);
	// }
	// return maxSum;
	// }

	// /* Question 2 --> Reverse the array */
	// static void reverseArray(int []arr) {
	// int n = arr.length;
	// for (int i = 0; i < n / 2; i++) {
	// int temp = arr[i];
	// arr[i] = arr[n - i - 1];
	// arr[n - i - 1] = temp;
	// }
	// for (int j = 0; j < n; j++) {
	// System.out.print(arr[j] + " ");
	// }
	// System.out.println();
	// }

	// /* Question 1 --> Maximum and Minimum Element in an Array ( We assume array
	// exist ) */
	// /* To find minimum element */
	// static int minElement(int []arr) {
	// int min = arr[0];
	// for (int i = 1; i < arr.length; i++) {
	// if (min > arr[i]) {
	// min = arr[i];
	// }
	// }
	// return min;
	// }
	// /* To find maximum element */
	// static int maxElement(int []arr) {
	// int max = arr[0];
	// for (int i = 1; i < arr.length; i++) {
	// if (max < arr[i]) {
	// max = arr[i];
	// }
	// }
	// return max;
	// }

	public static void main(String[] args) {
		// /* Question 1 --> Maximum and Minimum Element in an Array */
		// int [] arr = { 2, 6, 3, 1, 7,4, 8, 9 };
		// System.out.println("Maximum Element ==> " + maxElement(arr));
		// System.out.println("Minimum Element ==> " + minElement(arr));

		// /* Question 2 --> Reverse the array */
		// int [] arr = { 3, 2, 6, 1, 7, 4, 8, 9 };
		// reverseArray(arr);

		// /* Question 3 --> Maximum SubArray */
		// int [] arr = {2,-4,20,-10,4};
		// int result = maximumSubArray(arr);
		// System.out.println("Max of SubArray --> " + result);

		// /* Question 4 --> Contains Duplicate */
		// int []arr = {3,2,5,3,1};
		// boolean result = containsDuplicate(arr);
		// System.out.println("Contains duplicate --> "+ result);
	}
}
