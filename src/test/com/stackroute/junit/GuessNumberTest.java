package test.com.stackroute.junit;

import main.java.com.stackroute.junit.GuessNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {
    GuessNumber obj;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        obj = new GuessNumber();
    }

    @Test
    public void checkIfNumberMatches()
    {
        actualresult=obj.guess(51);
        expectedresult = "Number guessed matches the original number";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkIfNumberGreater()
    {
        actualresult= obj.guess(70);
        expectedresult="Number is greater than the original number";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkIfNumberIsSmaller()
    {
        actualresult = obj.guess(40);
        expectedresult = "Number is smaller than the original number";
        assertEquals(expectedresult,actualresult);
    }
}

