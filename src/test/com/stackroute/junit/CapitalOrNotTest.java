package test.com.stackroute.junit;

import main.java.com.stackroute.junit.CapitalOrNot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalOrNotTest {
    CapitalOrNot obj;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        obj = new CapitalOrNot();
    }

    @Test
    public void checkIfSmallerCaseLetter()
    {
        actualresult=obj.checkCharValue('c');
        expectedresult = "Smallcase letter";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkWhetherItisUpperCaseLetter()
    {
        actualresult= obj.checkCharValue('C');
        expectedresult="Capital letter";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkWhetherItIsDigit()
    {
        actualresult = obj.checkCharValue('6');
        expectedresult = "digit";
        assertEquals(actualresult,expectedresult);
    }
    @Test
    public void checkWhetherItIsSymbol()
    {
        actualresult = obj.checkCharValue('%');
        expectedresult = "special symbol";
        assertEquals(actualresult,expectedresult);
    }
}