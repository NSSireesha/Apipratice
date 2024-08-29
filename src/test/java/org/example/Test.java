package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {


public static boolean filematch(String  loc, String str) throws FileNotFoundException


    {
        //"C:\\Users\\sireesha_narakuchi\\IdeaProjects\\Test\\src\\test\\java\\org\\example\\textfile"

        File file = new File(loc);

        Scanner sc = new Scanner(file);


        while (sc.hasNext())
        {
            String line = sc.next();

            if (line.contains(str))
            {
                return true;
            } else
            {
                return false;
            }
        }

        return false;
    }


    public static void main (String[]args) throws FileNotFoundException {
        Boolean result = Test.filematch("C:\\Users\\sireesha_narakuchi\\IdeaProjects\\Test\\src\\test\\java\\org\\example\\textfile", "Red");

        System.out.println(result);
    }

}





