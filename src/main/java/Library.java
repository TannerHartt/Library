import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;


public class Library {

    /**
     * A simple solution to the popular FizzBuzz challenge.
     * @param num Passed number to check.
     * @return "Fizz" if num is divisible by 3, "Buzz" if it is divisible by 5, "FizzBuzz" if it's divisible by both.
     */
    public String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) return "FizzBuzz";
        if (num % 3 == 0) return "Fizz";
        if (num % 5 == 0) return "Buzz";
        return String.valueOf(num);
    }




    /**
     * Takes in a string and reverses it, then compares it to str to check if it's a palindrome.
     * This method offers two solutions, one more readable than the other.
     * @param str string check if it is a palindrome.
     */
    public boolean isPalindrome(String str) {
//        StringBuilder reverse = new StringBuilder();
//        String nstr = str.toLowerCase();
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reverse.append(nstr.charAt(i));
//        }
//        return nstr.equals(reverse.toString().toLowerCase());

        String A = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb.reverse();
        return A.equalsIgnoreCase(sb.toString());
    }



    /**
     * A simple method used to reverse the characters of any string, iteratively.
     * @param str String to be reversed.
     * @return The reversed version of the passed string.
     */
    public String reverseString(String str) {
        String nstr = "";  // Temp string to alter
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);    // Looping through str one character at a time.
            nstr = ch + nstr;   // Storing it in our temp string to return
        }
        return nstr;  // return the reversed string.
    }



    /**
     * An iterative solution to the Palindrome problem.
     * @param str String to be checked if it's a palindrome.
     * @return True if the string is a palindrome, false if otherwise.
     */
    public boolean reversePalindrome(String str) {
        String nstr = "";  // Temp string to alter
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);    // Looping through str one character at a time.
            nstr = ch + nstr;   // Storing it in our temp string to return
        }
        return nstr.equalsIgnoreCase(str);
    }


    /**
     * A recursive solution to the Fibonacci Series.
     * @param n Desired index in the series to be returned.
     * @return The fibonacci number at index n.
     */
    public int fibonacciR(int n)  {
        if(n == 0) // Base case
            return 0;
        else if(n == 1) // Base case
            return 1;
        else // Recursive call
            return fibonacciR(n - 1) + fibonacciR(n - 2);
    }



    /**
     * An iterative solution to the Fibonacci Sequence that supports negative numbers.
     * @param n Desired index in the series to be returned.
     * @return The fibonacci number at index n.
     */
    public int factorialI(int n) {
        int sum = n;
        if (n == 0 || n == 1 || n == -1) return 1;  // Base case

        if(n > 0 ) {  // Positive numbers
            for (int i = n; i > 1; i--) {
                sum *= (i - 1);
            }
        }

        if (n < 0) {  // Negative numbers
            for (int i = n; i < -2; i++) {
                sum *= (i + 1);
            }
        }
        return sum;
    }



    /**
     * A recursive solution to a fibonacci sequence using a ternary operator.
     * @param n The desired index in the fibonacci sequence.
     * @return The value in the fibonacci sequence that is in place n.
     */
    public int factorialR(int n) { return (n == 0 || n == 1)  ?  1 : n * factorialR(n - 1); }




    /**
     * Utility method that generates a random number between the passed values.
     * @param min The lower bound for the random number.
     * @param max the upper bound for the random number.
     * @return A random integer within the lower and upper bounds.
     */
    public int randomMinMax(int min, int max) {  // Takes in two ints and returns a random number between them.
        return  (int)Math.floor(Math.random() * (max-min) + min);
    }


    public String partString(String stringToParse, int start, int end) { // Takes in a String and returns a substring using the specified start and end variable
        return stringToParse.substring(start,end); }


    public String[] listRepeating (String[] list) {
        String[] newList = new String[list.length];
        String temp = "";
        int count = 0;

        for (String s : list) {
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                temp += ch;

//                if (temp.contains(String.valueOf(ch))) {
//                    newList[count] = temp;
//                    count++;
//                }
            }
        }

        return newList;
    }




    /**
     * This method takes in a string and reverses the characters in specified intervals.
     * @param str String to be parsed.
     * @param k The number of characters to be reversed, it also does the reverse every other k characters.
     * @return The reversed string.
     */
    public String reverseCharInString(String str, int k) {

        int size = str.length();
        char[] ch = str.toCharArray();

        for (int i = 0; i < size; i += 2*k) {
            for (int start = i, end = Math.min(i + k-1, ch.length - 1); start < end; start++, end--) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
            }
        }
        return new String(ch);
    }

}



