package main.java.com.stackroute.junit;
//method to check whether the character imput is capital letter or small case letter or digit or a special symbol
public class CapitalOrNot {


    public static String checkCharValue(char ch) {
        String str = "";
        //if condition check whether the character input is a capital letter
        if (ch >= 65 && ch <= 90) {
            str = "Capital letter";
        } else if (ch >= 97 && ch <= 122) {  //condition to check if the character input is smallcase letter
            str = "Smallcase letter";
        } else if (ch >= 48 && ch <= 57) {//condition to check if the character input is digit
            str = "digit";
        } else if ((ch > 0 && ch <= 47) || (ch >= 58 && ch <= 64) ||
                (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 127)) {//condition to check if the character input is a special symbol
            str = "special symbol";
        }
      return str;
    }
}
