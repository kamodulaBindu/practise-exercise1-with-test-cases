package main.java.com.stackroute.junit;

public class RepetitiveChars {

//method to print repetitive characters
    public static String repetitionOfChars(String str, int n) {
        int len = str.length();
        String s=str;
        int j =len-n;
        for (int k=0;k<n;k++){
            for (int i = j ; i<len; i++){
                s=s+str.charAt(i);
            }
        }
        return s;
    }
}
