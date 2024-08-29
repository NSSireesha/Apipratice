package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class large3 {
    public static void main(String[] args) {
        Integer[] arr= {1,5,7,8,0};

List<Integer> a= Arrays.asList(arr);

        Collections.sort(a);

      System.out.println( a.get(a.size()-3));

    }

}
