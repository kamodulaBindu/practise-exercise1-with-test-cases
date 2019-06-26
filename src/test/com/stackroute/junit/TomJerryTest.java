package test.com.stackroute.junit;

import main.java.com.stackroute.junit.CapitalOrNot;
import main.java.com.stackroute.junit.TomJerry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {
    TomJerry obj;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        obj = new TomJerry();
    }

    @Test
    public void checkIfEven()
    {
        actualresult=obj.tomOrJerry(22);
        expectedresult = "Jerry";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkIfOdd()
    {
        actualresult= obj.tomOrJerry(23);
        expectedresult="tom";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkIfOddOrEven()
    {
        actualresult = obj.tomOrJerry('@');
        expectedresult = "input is incorrect";
        assertEquals(actualresult,expectedresult);
    }

}

