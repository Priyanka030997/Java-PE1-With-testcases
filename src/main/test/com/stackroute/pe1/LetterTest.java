package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LetterTest {
    Letter let;
    @Before
    public void setup()
    {
        let=new Letter();
    }
    @Test
    public void FindCharacterisUppercaseorLowercase()
    {
        String result=let.FindCharacter('S');
        assertEquals("Capital Letter",result);
    }

    @Test
    public void FindCharacterisUppercaseorLowercase2()
    {
        String result=let.FindCharacter('r');
        assertEquals("Small Letter",result);
    }
    @Test
    public void FindCharacterisUppercaseorLowercase3()
    {
        String result=let.FindCharacter('8');
        assertEquals("Digit",result);
    }
    @Test
    public void FindCharacterisUppercaseorLowercase4()
    {
        String result=let.FindCharacter('/');
        assertEquals("Special Character",result);
    }
}