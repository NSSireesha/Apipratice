package org.example;

import static java.lang.Class.forName;

public class revers {

    public static void main(String[] args) {

int num=54;

int rev=0;
while(num!=0)
{
    int remainder= num%10;

    rev= rev*10+remainder;//4

    num=num/10;
}
System.out.println(rev);
    }
}


