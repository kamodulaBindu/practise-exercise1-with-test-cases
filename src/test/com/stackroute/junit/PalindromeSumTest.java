package test.com.stackroute.junit;

import main.java.com.stackroute.junit.PalindromeSum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeSumTest {
    PalindromeSum obj;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        obj = new PalindromeSum();
    }

    @Test
    public void checkIfPalindromeandSumGreaterThan25()
    {
        actualresult=obj.sum25(896787698);
        expectedresult = "896787698is palindrome and the sum of even numbers is greater than 25";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkIfPalindromeOrSumLessThan25()
    {
        actualresult= obj.sum25(1234321);
        expectedresult="1234321is a palindrome and the sum of even numbers is less than 25";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkIfNotAPalindrome()
    {
        actualresult = obj.sum25( 123456);
        expectedresult = "123456is not a palindrome";
        assertEquals(actualresult,expectedresult);
    }

}

