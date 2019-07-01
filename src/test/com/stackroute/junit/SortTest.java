package test.com.stackroute.junit;

import main.java.com.stackroute.junit.AddIntegers;
import main.java.com.stackroute.junit.Sort;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    Sort sort;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        sort = new Sort();
    }

    @Test
    public void sortAndSumOfEvenNumbers()
    {
        actualresult=sort.sortingList(new int[]{10,20,30,40});
        expectedresult = "sum of the even numbers is100";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void sortAndAddEvenNumbers()
    {
        actualresult= sort.sortingList(new int[]{9,10,6,9,2,20,40,28,7,3});
        expectedresult="sum of the even numbers is106";
        assertEquals(expectedresult,actualresult);
    }
    @After
    public void tearDown(){
        sort = null;
    }




}