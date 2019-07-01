package test.com.stackroute.junit;

import main.java.com.stackroute.junit.GuessNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {
    GuessNumber guessnumber;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        guessnumber = new GuessNumber();
    }

    @Test
    public void checkIfNumberMatches()
    {
        actualresult=guessnumber.guess(51);
        expectedresult = "Number guessed matches the original number";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkIfNumberGreater()
    {
        actualresult= guessnumber.guess(70);
        expectedresult="Number is greater than the original number";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkIfNumberIsSmaller()
    {
        actualresult = guessnumber.guess(40);
        expectedresult = "Number is smaller than the original number";
        assertEquals(expectedresult,actualresult);
    }
    @After
    public void tearDown(){
        guessnumber = null;
    }

}

