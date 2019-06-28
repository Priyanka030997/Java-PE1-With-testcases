package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString rev;
    @Before
    public void setup()
    {
        rev=new ReverseString();

    }
    @Test
    public void ReversetheGivenString()
    {
        String result=rev.Reverse("hello world");
        assertEquals("dlrow olleh",result);
    }
    @Test
    public void ReversetheGivenString2()
    {
       String result=rev.Reverse("hello");
       assertEquals("olleh",result);
    }
    @Test
    public void ReversetheGivenString3()
    {
        String result=rev.Reverse(null);
        assertEquals("null not allowed",result);
    }

}