package test.com.stackroute.junit;

import main.java.com.stackroute.junit.CapitalOrNot;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalOrNotTest {
    CapitalOrNot capitalornot;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        capitalornot = new CapitalOrNot();
    }

    @Test
    public void checkIfSmallerCaseLetter()
    {
        actualresult=capitalornot.checkCharValue('c');
        expectedresult = "Smallcase letter";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkWhetherItisUpperCaseLetter()
    {
        actualresult= capitalornot.checkCharValue('C');
        expectedresult="Capital letter";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkWhetherItIsDigit()
    {
        actualresult = capitalornot.checkCharValue('6');
        expectedresult = "digit";
        assertEquals(actualresult,expectedresult);
    }
    @Test
    public void checkWhetherItIsSymbol()
    {
        actualresult = capitalornot.checkCharValue('%');
        expectedresult = "special symbol";
        assertEquals(actualresult,expectedresult);
    }
    @After
    public void tearDown(){
        capitalornot = null;
    }

}