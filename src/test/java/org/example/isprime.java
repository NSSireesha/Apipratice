package org.example;

public class isprime {

    public static void main(String[] args) {

        int n=20;
        int count;


        for (int i=2; i<20; i++) {
            count = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;

                }
            }

            if (count == 0) {
                System.out.println(i);
            }
        }




    }
}
