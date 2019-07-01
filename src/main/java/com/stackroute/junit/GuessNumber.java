package main.java.com.stackroute.junit;

import java.util.Scanner;
//method to check if the guessed number matches the target number
public class GuessNumber {

    public static String guess(int guessednumber) {
        int target = 51;
        String str = " ";
        if (guessednumber == target) {//condition to check if the guessed number matches the target number
            str = "Number guessed matches the original number";
        } else if (guessednumber > target) { //condition to check if the guessed number is greater than the target number
            str = "Number is greater than the original number";

        } else if (guessednumber < target) { //condition to check if the guessed number is smaller than the target number
            str = "Number is smaller than the original number";

        } 
    return str;
    }

}
