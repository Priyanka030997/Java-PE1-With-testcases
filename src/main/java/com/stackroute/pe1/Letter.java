package com.stackroute.pe1;

import java.io.*;
import java.util.*;
public class Letter {
    //main class
    public String FindCharacter(char character)
    {
        //find uppercase or lowercase or digit or special character
        if((character>=65)&&(character<=90))
        {
            return "Capital Letter";
        }
        else if((character>=97)&&(character<=122))
        {
            return "Small Letter";
        }
        else if((character>=48)&&(character<=57))
        {
            return"Digit";
        }
        else if((character>=1)&&(character<=47) || (character>57)&&(character<=64) || (character>90)&&(character<=96) || (character>122)&&(character<=127))
        {

            return "Special Character";
        }
        else
        {
            return "error";
        }


    }
}
