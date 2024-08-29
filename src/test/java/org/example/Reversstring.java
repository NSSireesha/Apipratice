package org.example;

public class Reversstring {

    public static void reverse(String str)
    {
        int len= str.length();

        String rev= "";
        for (int i=len-1; i>0; i--)
        {
            rev=rev+str.charAt(i);
        }

        System.out.println(rev);
    }

    public static void main(String[] args) {

        Reversstring.reverse("i am young");
    }
}
