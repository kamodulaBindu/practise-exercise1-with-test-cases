package main.java.com.stackroute.junit;

import java.util.Scanner;

public class AddIntegers {
    //method to add integers specified in an array
    public static int adding(int array[])
    {
        int sum = 0;
        for (int i = 0; i< array.length; i++){
            sum = sum + array[i];
        }
        //return statement give the output of sum of integers in the array
        return sum;
    }
}
