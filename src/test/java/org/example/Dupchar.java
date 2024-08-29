package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dupchar {

    public static void main(String[] args) {

        String str= "halloween";

       char [] ch= str.toCharArray();

       Map<Character, Integer> mp= new HashMap<>();

       for (char c:ch)
       {
           if (mp.containsKey(c))
           {
               mp.put(c, mp.get(c)+1);

           }
           else
           {
               mp.put(c,1);
           }
       }

      Set<Character> str1= mp.keySet();
       for (char s:str1)
       {
           if (mp.get(s)>1)
           {
               System.out.println(s+"is"+ mp.get(s));
           }
       }
    }
}
