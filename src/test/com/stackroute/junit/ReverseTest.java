package test.com.stackroute.junit;

import main.java.com.stackroute.junit.Reverse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {
    Reverse reverse;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        reverse = new Reverse();
    }

    @Test
    public void checkIfSmallerCaseLetter()
    {
        actualresult=reverse.stringReverse("london");
        expectedresult = " nodnol";
        assertEquals(expectedresult,actualresult);
    }
    @After
    public void tearDown(){
        reverse = null;
    }


}
