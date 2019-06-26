package main.java.com.stackroute.junit;

import java.util.Scanner;

public class GuessNumber {

    public static String guess(int n) {
        int m = 51;
        String s = " ";
        if (n == m) {
            s = "Number guessed matches the original number";
        } else if (n > m) {
            s = "Number is greater than the original number";

        } else if (n < m) {
            s = "Number is smaller than the original number";

        } 
    return s;
    }

}
