package org.example;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileread {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\sireesha_narakuchi\\IdeaProjects\\Test\\src\\test\\java\\org\\example\\textfile");

        Scanner sc= new Scanner(file);

        while (sc.hasNext())
        {
            String text= sc.next();
            System.out.println(text);
        }
        sc.close();

    }



}
