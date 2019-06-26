package test.com.stackroute.junit;

import main.java.com.stackroute.junit.Reverse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {
    Reverse obj;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        obj = new Reverse();
    }

    @Test
    public void checkIfSmallerCaseLetter()
    {
        actualresult=obj.stringReverse("london");
        expectedresult = " nodnol";
        assertEquals(expectedresult,actualresult);
    }

}
