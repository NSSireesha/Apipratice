package org.example;

import net.bytebuddy.dynamic.scaffold.MethodGraph;

import java.util.LinkedList;
import java.util.List;

public class orderdups {
    public static void main(String[] args) {
        String str= "dadeadrs";

        List<Character> ls= new LinkedList<>();
        for (int i=0; i<str.length(); i++)
        {

            if (!ls.contains(str.charAt(i))) {
                ls.add(str.charAt(i));


                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == str.charAt(i)) {
                        ls.add(str.charAt(i));
                    }
                }
            }



        }
        for (Character ch:ls)

        {
            System.out.println(ch);
        }

    }

}
