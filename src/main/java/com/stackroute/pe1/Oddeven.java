package com.stackroute.pe1;

public class Oddeven {
//find even or odd
    public String FindEvenOdd(int number)
    {
        if((number>=20)&&(number<=30))
        {
            if (number % 2 == 0) {
                return "Jerry";
            }
            else {
                return "Tom";
            }
        }
        else
        {
            return "Error";
        }
    }
}
