package org.example;



import java.util.HashSet;
import java.util.Set;

public class duplicatestr {

    public static void main(String[] args) {

        String str = "Iam Java Java program";
        StringBuffer sb1= new StringBuffer();
     String [] str1=   str.split("\\s+");


     Set<String> newstring= new HashSet<>();


     for (String s:str1)
     {
        if ( newstring.add(s))

        {
            sb1.append(s).append(" ");
        }
     }

        System.out.println(sb1);

}

    }

