package org.example;

public class secondmax {

    public static void main(String[] args) {


        //o(nlogn)-- sorting . Sorting cannot do duplicate elements


        Integer arr[] = {10, 13, 10, 16,16};
        int max= Integer.MIN_VALUE;
        int secondmax= Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++)
        {
            if (arr[i]>max)
            {
                secondmax=max;
                max=arr[i];

            }
            else if (arr[i]<max && arr[i] >secondmax)
            {
                secondmax=arr[i];
            }
        }
        System.out.println(secondmax);





    }

}