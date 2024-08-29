package org.example;


import static org.apache.commons.lang3.CharSetUtils.count;

public class Countcharacs {

    public static void main(String[] args) {

        String str= "iam indian";

      long count=  str.chars().filter(e->(char)e=='i').count();
System.out.println(count);

    }
}
