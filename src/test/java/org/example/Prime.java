package org.example;

public class Prime {
    public static void main(String[] args) {


        int num=20;


        for (int i=1; i<=num; i++)
        {
          int  count=0;
            for (int j=2; j<=i/2; j++)
            {
                if (i%j==0)
                {
                    count++;
                }
            }
            if (count == 0)
            {
System.out.println(i);
            }
        }



    }


}