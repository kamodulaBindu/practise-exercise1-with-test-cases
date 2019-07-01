package main.java.com.stackroute.junit;

public class ConstantVowel {

//method to check whether the input character given is consonant or a vowel
    public static String vowelOrConsonant(String word) {
        int i;
        String str = "";
        int len = word.length();
        for (i = 0; i < len; i++) {
            char input = word.charAt(i);//to check if the character input is vowel
            if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
                str = "vowel";
            } else { //to check if the character input is consonant
                str = "consonant";
            }
        }
        return str;
    }
}