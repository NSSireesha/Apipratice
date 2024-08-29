package org.example;

import org.checkerframework.checker.units.qual.C;

import java.util.HashSet;

public class duplicates {

    public static void main(String[] args) {
Integer [] arry= {1,5,6,6,1,9,2};

HashSet<Integer> hs = new HashSet<Integer>();

for (int a: arry)
{
    hs.add(a);
}

System.out.println(hs);
    }
}

