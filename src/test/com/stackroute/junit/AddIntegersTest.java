package test.com.stackroute.junit;

import main.java.com.stackroute.junit.AddIntegers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddIntegersTest {
    AddIntegers add;

    @Before
    public void setUp()throws Exception {
        add = new AddIntegers();
    }

    @Test
    public void addingOfNumbers()
    {
        int sum =add.adding(new int[]{10,20,30,40});
        assertEquals(100,sum);
    }
    @Test
    public void checkIfRepeation()
    {
        int sum =add.adding(new int[]{11,20,30,40});
        assertEquals(101,sum);
    }

}