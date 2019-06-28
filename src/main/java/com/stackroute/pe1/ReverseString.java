package com.stackroute.pe1;

public class ReverseString {
    //reverse the string
    public String Reverse(String str)
    {
        if(str==null)
        {
            return "null not allowed";
        }
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
          reverse=reverse+str.charAt(i);
        }
        return reverse;

    }
}
