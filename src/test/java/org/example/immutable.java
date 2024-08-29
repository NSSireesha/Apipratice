package org.example;

import org.apache.xmlbeans.impl.schema.StscChecker;

public class immutable {

    public static void main(String[] args) {

        String s1= "hello";
        String S2= s1;


        System.out.println(s1==S2);
        s1= "world";

        System.out.println(s1);
        System.out.println(S2);

        System.out.println(s1==S2);
    }
}
