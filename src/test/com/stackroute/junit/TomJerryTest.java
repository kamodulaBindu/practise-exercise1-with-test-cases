package test.com.stackroute.junit;

import main.java.com.stackroute.junit.CapitalOrNot;
import main.java.com.stackroute.junit.TomJerry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {
    TomJerry tomJerry;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        tomJerry = new TomJerry();
    }

    @Test
    public void checkIfEven()
    {
        actualresult=tomJerry.tomOrJerry(22);
        expectedresult = "Jerry";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkIfOdd()
    {
        actualresult= tomJerry.tomOrJerry(23);
        expectedresult="tom";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkIfOddOrEven()
    {
        actualresult = tomJerry.tomOrJerry('@');
        expectedresult = "input is incorrect";
        assertEquals(actualresult,expectedresult);
    }
    @After
    public void tearDown(){
        tomJerry   = null;
    }


}

