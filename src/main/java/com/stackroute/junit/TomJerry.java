package main.java.com.stackroute.junit;

import java.util.Scanner;

public class TomJerry {



    public static String tomOrJerry(int n) {
        if(n%2==0 && n>20 && n<30)
        {
            return "Jerry";
        }
        else if( n%2!=0 && n>20 && n<30)
        {
            return "tom";

        }
        else {
            return "input is incorrect";
        }
    }
}

