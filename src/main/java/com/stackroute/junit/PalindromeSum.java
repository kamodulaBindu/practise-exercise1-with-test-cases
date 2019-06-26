package main.java.com.stackroute.junit;

public class PalindromeSum {


    public static String sum25(int n) {
        String s;
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
        if (a == m) {
            if (sum > 25) {
                s = m + "is palindrome and the sum of even numbers is greater than 25";
            } else {

                s = m + "is a palindrome and the sum of even numbers is less than 25";
            }

        } else {
            s = m + "is not a palindrome";
        }
        return s;
    }
}
