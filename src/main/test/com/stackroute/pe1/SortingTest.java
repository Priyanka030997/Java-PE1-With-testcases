package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {

    Sorting sort;
    @Before
    public void setup()
    {
        sort=new Sorting();

    }
    @Test
    public void SorttheNumbersAndSumisNotGreater()
    {
        String result=sort.NumberSorting(234534);
        assertEquals("False",result);
    }

    @Test
    public void SorttheNumbersAndSumisGreater()
    {
        String result=sort.NumberSorting(264534);
        assertEquals("True",result);
    }
    @Test
    public void SorttheNegativeNumbers()
    {
        String result=sort.NumberSorting(-234534);
        assertEquals("Error",result);
    }

}