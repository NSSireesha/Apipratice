package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Sortarr {
    public static void main(String[] args) {

       Scanner sc= new Scanner(System.in);
        int t=0;
       int n=sc.nextInt();

       int a[]= new int[n];

       for (int i=0; i<n; i++)
       {
           a[i]= sc.nextInt();
       }

       for (int i=0; i<a.length; i++)
       {
           for (int j=i+1; j<a.length; j++)
           {


               if (a[i]<a[j])
               {
                   t=a[i];
                   a[i]= a[j];
                   a[j]=t;


               }
           }
       } System.out.println(Arrays.toString(a));

    }

}

