package org.example;

public class pattern1 {

    public static void main(String[] args) {

String s= "sample";
char[] ch=s.toCharArray();
int len=ch.length;

for (int i=0; i<len; i++)
{
    for (int j=0; j<len; j++)
    {
        System.out.print(s.substring(0,len));
        System.out.println("\t");
        len--;
    }

            System.out.println("");
        }
    }

}
