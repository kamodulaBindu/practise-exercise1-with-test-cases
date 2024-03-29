package test.com.stackroute.junit;

import main.java.com.stackroute.junit.PatternSequence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternSequenceTest {
    PatternSequence patternsequence;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        patternsequence = new PatternSequence();
    }

    @Test
    public void checkIfRepeated()
    {
        actualresult=patternsequence.sequence(5);
        expectedresult = "122333444455555";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkIfWorking()
    {
        actualresult=patternsequence.sequence(4);
        expectedresult = "1223334444";
        assertEquals(actualresult,expectedresult);
    }
    @After
    public void tearDown(){
        patternsequence = null;
    }


}