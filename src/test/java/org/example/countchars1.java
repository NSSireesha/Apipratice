package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countchars1 {

    public static <get> void main(String[] args) {



    String s3= "halloween";
    //  long count=s3.chars().filter(e->(char)e=='e').count();

    Map<Character, Integer> map1= new HashMap<Character, Integer>();
   char[] charArray =s3.toCharArray();

   for (char ch:charArray)
   {
       if (map1.containsKey(ch))
       {
           map1.put(ch, map1.get(ch)+1);

       }
       else
       {
           map1.put(ch, 1);

       }



      Set<Character> set1= map1.keySet();

       for (char ch1: set1)
       {
           if (map1.get(ch)>1)
           {
               System.out.println(ch1 +"is"+ map1.get(ch1));
           }
       }



   }

    //System.out.println(count);

}
}
