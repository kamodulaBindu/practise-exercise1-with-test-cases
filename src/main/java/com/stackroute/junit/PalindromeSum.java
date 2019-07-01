package main.java.com.stackroute.junit;

public class PalindromeSum {

   //method to check if the input integer is palindrome or not, if yes whether the sum of even numbers in the integer is greater than 25 or not
    public static String sum25(int n) {
        String str;
        int m = n;
        int x, a = 0, sum = 0;
        while (n > 0) {
            x = n % 10;
            a = a * 10 + x;
            n = n / 10;
            if (x % 2 == 0) {
                sum = sum + x;
            }
        }
        if (a == m) {//check if integer is palindrome or not
            if (sum > 25) {//check if the sum of even numbers of palindrome is greater than 25
                str = m + "is palindrome and the sum of even numbers is greater than 25";
            } else {//check if the sum of even numbers of palindrome is less than 25

                str = m + "is a palindrome and the sum of even numbers is less than 25";
            }

        } else {//if not a palindrome
            str = m + "is not a palindrome";
        }
        return str;
    }
}
