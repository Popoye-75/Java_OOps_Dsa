package Java_OOps_Dsa.Patterns;

class Solution {
    // * Question 1 --> Right half pyramid */
    public void rightHalf(int n) {
        for (int i = 1; i <= n; i++) { // Outer loop
            for (int j = 1; j <= i; j++) { // Inner loop
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * Question 2 --> Inverted right half pyramid */
    public void invertedRightHalf(int n) {
        for (int i = 1; i <= n; i++) { // Outer loop
            for (int j = n; j >= i; j--) { // Inner loop
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * Question 3 --> Inverted left half pyramid */
    public void invertedLeftHalf(int n) {
        for (int i = 1; i <= n; i++) { // Outer loop
            for (int j = 1; j < i; j++) { // Inner loop-1
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) { // Inner loop-2
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * Question 4 --> Left half pyramid */
    public void leftHalf(int n) {
        for (int i = 1; i <= n; i++) { // Outer loop
            for (int j = n; j > i; j--) { // Inner loop-1
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) { // Inner loop-2
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * Question 5 --> Full pyramid / Triangle */
    public void fullPyramid(int n) {
        for (int i = 1; i <= n; i++) { // Outer loop
            for (int j = 1; j <= n - i; j++) { // Inner loop - 1
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // Inner loop - 2
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * Question 6 --> Inverted Full pyramid / Triangle */
    public void invertedFullPyramid(int n) {
        for (int i = n; i >= 1; i--) { // Outer loop
            for (int j = 1; j <= n - i; j++) { // Inner loop - 1
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // Inner loop - 2
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * Question 7 --> Half diamond pattern */
    public void halfDiamond(int n) {
        /* Upper part */
        for (int i = 1; i <= n; i++) { // Outer loop - 1
            for (int j = 1; j <= i; j++) { // Inner loop - 1
                System.out.print("* ");
            }
            System.out.println();
        }
        /* Lower part */
        for (int i = n - 1; i >= 1; i--) { // Outer loop - 2
            for (int j = 1; j <= i; j++) { // Inner loop - 2
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * Question 8 --> Diamond pattern */
    public void diamond(int n) {
        /* Upper part */
        for (int i = 1; i <= n; i++) { // Outer loop - 1
            for (int j = n; j >= i; j--) { // Inner loop - 1
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // Inner loop - 2
                System.out.print("* ");
            }
            System.out.println();
        }
        /* Lower part */
        for (int i = n; i >= 1; i--) { // Outer loop - 2
            for (int j = n; j >= i; j--) { // Inner loop - 1
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // Inner loop - 2
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * Question 9 --> Alphabet 'A' */
    public void alphabetA(int n) {

    }

    // * Question 10 --> Solid and Hollow Rectangle */
    public void solidAndHallowRect(int n) {
        /* Solid Rectangle */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        /* Hallow Rectangle */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //* Question 11 --> Stair Case pattern */
    public void stairCase(int n){
        for(int i = 1; i <= n; i++){
            int k = (i % 2 != 0)? i+ 1: i;
            for(int j = 0 ; j < k; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

public class EasyPatterns {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // sol.rightHalf(5); // Right half
        // sol.invertedRightHalf(5); // Inverted Right half
        // sol.invertedLeftHalf(5); // Inverted Left half
        // sol.leftHalf(5); // Left half
        // sol.fullPyramid(5); // Full pyramid || Triangle
        // sol.invertedFullPyramid(5); // Inverted Triangle pyramid
        // sol.halfDiamond(5); // Half diamond
        // sol.diamond(5); // Diamond
        // sol.alphabetA(5); // Alphabet 'A'
        // sol.solidAndHallowRect(5); // Solid and Hallow Rectangle
        sol.stairCase(6);
    }
}
