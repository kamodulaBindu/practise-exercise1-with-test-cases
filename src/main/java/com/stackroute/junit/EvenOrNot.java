package main.java.com.stackroute.junit;

import java.util.Scanner;
//method to print jerry if even and inbetween 20 and 30 or tom if it is odd and between 20 and 30
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

