package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class revnum {

    public static void main(String[] args) {

        String str1 = "halloween";

        char[] ch = str1.toCharArray();

        Map<Character, Integer> mp = new HashMap<>();

        for (char c : ch) {
            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }
        }

        Set<Character> s1 = mp.keySet();
        for (char c : s1) {
            if (mp.get(c)>1)
            {
                System.out.println(c+"is repeated"+ mp.get(c));
            }
        }
    }
}
