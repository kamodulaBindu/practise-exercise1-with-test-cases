package test.com.stackroute.junit;

import main.java.com.stackroute.junit.RepetitiveChars;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepetitiveCharsTest {
    RepetitiveChars obj;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        obj = new RepetitiveChars();
    }

    @Test
    public void checkIfRepeated()
    {
        actualresult=obj.repetitionOfChars("london",3);
        expectedresult = "londondondondon";
        assertEquals(actualresult,expectedresult);
    }
    @Test
    public void checkIfRepeation()
    {
        actualresult=obj.repetitionOfChars("stackroute",5);
        expectedresult = "stackrouterouterouterouterouteroute";
        assertEquals(actualresult,expectedresult);
    }

}


