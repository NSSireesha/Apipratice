package org.example;

public class longestwrd {
    public static void main(String[] args) {
        String str= "iam happier than uesterday";

        String [] str1= str.split("\\s+");

        String longwrd =" ";

        for (int i=0; i<str1.length; i++)
        {
for (int j= i+1; j<str1.length; j++) {
    if (str1[i].length() > str1[j].length()) {
        longwrd = str1[i];

    } else {
        longwrd = str1[j];
    }
}



        }
        System.out.println(longwrd);
    }


}
