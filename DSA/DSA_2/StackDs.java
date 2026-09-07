// import java.util.Stack;

public class StackDs {
   
   // /* Question 2 ==> Reverse the string Basic approach*/
   // static String reverse(String str){
   //    int n = str.length();
   //    if(str == null){
   //       return "String is empty";
   //    }
   //    Stack<Character> stack = new Stack<>();
   //    for(int i = 0; i < n; i++){
   //       stack.push(str.charAt(i));
   //    }
   //    char ch [] = new char[n];
   //       for(int i = 0; i < n; i++){
   //          ch[i] = stack.pop();
   //    }
   //    return new String(ch);
   // }

   // /* Question 1 ==> Valid parenthesis */
   // static boolean isValid(String str) {
   //    Stack<Character> stack = new Stack<>();
   //    for (int i = 0; i < str.length(); i++) {
   //       char ch = str.charAt(i);
   //       if ((ch == '(') || (ch == '{') || (ch == '[')) {
   //          stack.push(ch);
   //       } else {
   //          if(stack.isEmpty()){
   //             return false;
   //          }
   //          char top = stack.pop();
   //          if ((top == '(' && ch != ')') || (top == '{' && ch != '}') || (top == '[' && ch != ']')) {
   //             return false;
   //          }
   //       }
   //    }
   //    return stack.isEmpty();
   // }

   public static void main(String[] args) {
      // /* Question 1 ==> Valid parenthesis */
      // String str = "({[]})";
      // System.out.println("Valid : " + isValid(str));

      // /* Question 2 ==> Reverse the string */
      // String str = "I Love Java";
      // System.out.println("Before reverse ==> "+str);
      // System.out.println("After reverse ==> "+reverse(str));
   }
}
