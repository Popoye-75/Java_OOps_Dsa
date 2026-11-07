public class OnlyDsaRecursion_6 {

        // /* Question 4 --> Calculate the power of given base */
        static int power(int base,int exp){
            if(exp == 0){
                return 1;
            }if(exp == 1){
                return base;
            }
            return base * power(base, --exp);
        }

    // /* Question 3 --> Reverse the string */
    static String reverseStr(String str, int i) {
        if(i < 0){
            return "";
        }
        return  str.charAt(i)+reverseStr(str, i-1);
    }

    // /* Question 2 --> Find sum of array */
    static int arrSum(int[] arr, int i) {
        if (i < 0) {
            return 0;
        }
        return arr[i] + arrSum(arr, --i); // Here (i-- != i - 1) && (--i == i - 1)
    }

    // /* Question 1 ---> Factorial of number */
    static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // /* Question 1 ---> Factorial of number */
        // int n = 5;
        // int result = factorial(n);
        // System.out.println("Factorial of n : " + result);

        // /* Question 2 --> Find sum of array */
        // int[] arr = { 1, 3, 4, 2, 5 };
        // int sum = arrSum(arr, arr.length - 1);
        // System.out.println("Sum of Array : " + sum);

        // /* Question 3 --> Reverse the string */
        // String str = "popoye";
        // int n = str.length() - 1;
        // String newStr = reverseStr(str, n);
        // System.out.println("Reversed String : " + newStr);

        // /* Question 4 --> Calculate the power of given base */
        // int result = power(2, 8);
        // System.out.println("Power of base : " + result);
    }
}
