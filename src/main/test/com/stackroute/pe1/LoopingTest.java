package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopingTest {
    Looping loop;
    @Before
    public void setup()
    {
        loop=new Looping();
    }
    @Test
    public void GenerateSeriesforPositive()
    {
        String result=loop.LoopPrinting(3);
        assertEquals("1 2 2 3 3 3",result);
    }
    @Test
    public void GenerateSeriesforZero()
    {
        String result=loop.LoopPrinting(0);
        assertEquals("",result);
    }
    @Test
    public void GenerateSeriesforNegativeNumber()
    {
        String result=loop.LoopPrinting(-2);
        assertEquals("",result);
    }
}