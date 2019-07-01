package test.com.stackroute.junit;

import main.java.com.stackroute.junit.ConstantVowel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstantVowelTest {
    ConstantVowel consonantvowel;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        consonantvowel = new ConstantVowel();
    }

    @Test
    public void checkIfConsonant()
    {
        actualresult=consonantvowel.vowelOrConsonant("c");
        expectedresult = "consonant";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkIfVowel()
    {
        actualresult= consonantvowel.vowelOrConsonant("o");
        expectedresult="vowel";
        assertEquals(expectedresult,actualresult);
    }
    @After
    public void tearDown(){
        consonantvowel = null;
    }


}

