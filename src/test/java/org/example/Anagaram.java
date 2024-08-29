package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagaram {

    public static boolean anagaramtest(String s1, String s2)
    {
char[] c1=s1.toLowerCase().toCharArray();
        char[] c2=s2.toLowerCase().toCharArray();
        if (c1.length!= c2.length) {
            return false;
        }
        else
        {
            Arrays.sort(c1);
            Arrays.sort(c2);

           return ( Arrays.equals(c1,c2));
        }


    }

    public static void main(String[] args) {


        System.out.println(Anagaram.anagaramtest("Mother In Law", "Hitler Woman"));
    }
}
