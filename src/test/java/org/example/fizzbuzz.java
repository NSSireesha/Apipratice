package org.example;

import java.util.Scanner;

public class fizzbuzz {

    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);

        Integer n=sc.nextInt();

        if ((((n % 5) == 0) && ((n % 3) == 0)))
        {
            System.out.println("fizz buzz");
        }

        else if (n%5==0)
        {
            System.out.println("buzz");
        }

else if  (n%3==0)
        {
            System.out.println("fizz ");
        }
else
        {
System.out.println(n);
        }
sc.close();
    }
}
