package main.java.com.stackroute.junit;

import java.util.Scanner;

public class AddIntegers {
    public static int adding(int array[])
    {
        int sum = 0;
        for (int i = 0; i< array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }
}
