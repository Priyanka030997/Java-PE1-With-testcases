package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {

    GuessNumber guess;
    @Before
    public void setup()
    {
        guess=new GuessNumber();
    }
    @Test
    public void GuessNumberislessthanOriginalNumber()
    {
        String result=guess.checkwithoriginalnumber(26);
        assertEquals("Number guessed is less than original number",result);
    }
    @Test
    public void GuessNumberismorethanOriginalNumber()
    {
        String result=guess.checkwithoriginalnumber(60);
        assertEquals("Number guessed is more than original number",result);
    }

    @Test
    public void GuessNumberMatchesOriginalNumber()
    {
        String result=guess.checkwithoriginalnumber(50);
        assertEquals("Number guessed matches the original number",result);
    }
}