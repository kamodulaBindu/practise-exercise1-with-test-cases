package main.java.com.stackroute.junit;

public class PatternSequence {


    public static String sequence(int n) {
        int i, j;
        String s = "";
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                s = s + i;
            }

        }
        return s;
    }
}
