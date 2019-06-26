package main.java.com.stackroute.junit;

public class ConstantVowel {


    public static String vowelOrConsonant(String word) {
        int i;
        String s = "";
        int len = word.length();
        for (i = 0; i < len; i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                s = "vowel";
            } else {
                s = "consonant";
            }
        }
        return s;
    }
}