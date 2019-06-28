package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelconsonantsTest {
    Vowelconsonants vow;
    @Before
    public void setup()
    {
        vow=new Vowelconsonants();

    }
    @Test
    public void FindCharacterisVowelorConsonants()
    {
        String result=vow.FindVowelConsonants("ap");
        assertEquals("Vowel Consontant",result);
    }

    @Test
    public void FindCharacterisVowelorConsonants2()
    {
        String result=vow.FindVowelConsonants("9");
        assertEquals("Error",result);
    }

    @Test
    public void FindCharacterisVowelorConsonants3()
    {
        String result=vow.FindVowelConsonants("S@");
        assertEquals("Consontant Error",result);
    }
}