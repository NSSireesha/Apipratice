package org.example;

public class revstring {


public static StringBuffer revstring(String str)
{
    StringBuffer rev1= new StringBuffer(str);

    rev1.reverse();

    return rev1;
}

    public static void main(String[] args) {

   StringBuffer reverse_str= revstring.revstring("Iam robot");

   System.out.println(reverse_str.toString());

    }

}
