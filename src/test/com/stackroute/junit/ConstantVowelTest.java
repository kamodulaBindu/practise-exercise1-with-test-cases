package test.com.stackroute.junit;

import main.java.com.stackroute.junit.ConstantVowel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstantVowelTest {
    ConstantVowel obj;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        obj = new ConstantVowel();
    }

    @Test
    public void checkIfConsonant()
    {
        actualresult=obj.vowelOrConsonant("c");
        expectedresult = "consonant";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkIfVowel()
    {
        actualresult= obj.vowelOrConsonant("o");
        expectedresult="vowel";
        assertEquals(expectedresult,actualresult);
    }

}

