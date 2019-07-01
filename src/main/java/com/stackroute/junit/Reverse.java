package main.java.com.stackroute.junit;

import java.util.Scanner;
//metod to print reverse of a string
public class Reverse {

    public static String  stringReverse(String str) {
        int l,i;
        String reverse = " ";
        for (i = str.length()-1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

}

