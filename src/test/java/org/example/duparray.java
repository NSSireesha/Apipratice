package org.example;

import java.util.HashSet;
import java.util.Set;

public class duparray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 3, 5};

        int sum = 0;
       /* Set<Integer> hs= new HashSet<>();

        for (int a1: a)
        {
            hs.add(a1);
        }
        System.out.println(hs);
    }*/
        for (int i=0; i<a.length;i++)
        {
            sum=sum+a[i];
        }

        System.out.println(sum);
    }



}
