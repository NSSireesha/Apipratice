package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class repeatnum {
    public static void main(String[] args) {
        Integer[] arr= {1,5,5,6,6,6};

        Map<Integer, Integer> mp= new HashMap<>();

        for (int i: arr)
        {
            if (mp.containsKey(i))
            {
                mp.put(i, mp.get(i)+1);
            }
            else
            {
                mp.put(i,1);
            }
        }

        Set<Integer> s1= mp.keySet();

        for (int s:s1)
        {
            if (mp.get(s)>1)
            {
                System.out.println(s+"is "+ mp.get(s));
            }
        }
    }



}
