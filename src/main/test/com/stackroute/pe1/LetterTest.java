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
    public void CharacterisUppercase()
    {
        String result=let.FindCharacter('S');
        assertEquals("Capital Letter",result);
    }

    @Test
    public void CharacterisLowercase()
    {
        String result=let.FindCharacter('r');
        assertEquals("Small Letter",result);
    }
    @Test
    public void CharacterisDigit()
    {
        String result=let.FindCharacter('8');
        assertEquals("Digit",result);
    }
    @Test
    public void CharacterisSpecialCharacter()
    {
        String result=let.FindCharacter('/');
        assertEquals("Special Character",result);
    }
}