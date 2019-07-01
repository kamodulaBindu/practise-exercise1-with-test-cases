package test.com.stackroute.junit;

import main.java.com.stackroute.junit.RepetitiveChars;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepetitiveCharsTest {
    RepetitiveChars repetitiveChars;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        repetitiveChars = new RepetitiveChars();
    }

    @Test
    public void checkIfRepeated()
    {
        actualresult=repetitiveChars.repetitionOfChars("london",3);
        expectedresult = "londondondondon";
        assertEquals(actualresult,expectedresult);
    }
    @Test
    public void checkIfRepeation()
    {
        actualresult=repetitiveChars.repetitionOfChars("stackroute",5);
        expectedresult = "stackrouterouterouterouterouteroute";
        assertEquals(actualresult,expectedresult);
    }
    @After
    public void tearDown(){
        repetitiveChars = null;
    }


}


