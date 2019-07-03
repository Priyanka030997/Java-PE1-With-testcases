package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    Sum obj;
    @Before
    public void setup()
    {
        obj=new Sum();
    }
    @Test
    public void SumOfPositiveNumbers()
    {
        int a1[]={10,3,2,5};
        int result=obj.sumofnumbers(a1);
        assertEquals(20,result);
    }
    @Test
    public void SumOfNumbers()
    {
        int a2[]={10,3,2,-15};
        int result=obj.sumofnumbers(a2);
        assertEquals(0,result);
    }
    @Test
    public void SumOfNegativeandPositiveNumbers()
    {
        int a3[]={0,3,2,-15};
        int result=obj.sumofnumbers(a3);
        assertEquals(-10,result);
    }

}