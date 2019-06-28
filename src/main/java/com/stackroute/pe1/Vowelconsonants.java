package com.stackroute.pe1;

public class Vowelconsonants {
    //find character is vowel or consonants
    public String FindVowelConsonants(String str) {
        //String res[]=new String[10];
        String res="";
       // int i=0;
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                res=res+"Vowel ";
                //i++;
            } else if (((ch >= 65) && (ch <= 90)) || ((ch >= 97) && (ch <= 122))) {
                res=res+"Consontant ";
               // i++;
            } else {
                res=res+"Error";
              //  i++;
            }

        }
        return res.trim();
    }
}

