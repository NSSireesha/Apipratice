package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class matcharray {

    public static boolean issame(int[] a1, int[] a2) {

        Set<Object> hs1= new HashSet(Arrays.asList(a1));
        Set<Object> hs2= new HashSet(Arrays.asList(a1));


        if (hs1.size()!= hs2.size())
        {
            return false;
        }

        else
        {
            for (Object hs:hs1)
            {
                if (hs2.contains(hs))
                {
                    return true;
                }
                return false;
            }

        }
        return false;
    }






    public static void main(String[] args) {
        int [] a1= {1,2,3,2};
        int[] a2= {1,2,3};
      Boolean boo=  matcharray.issame(a1,a2);
        System.out.println(boo);

    }
}
