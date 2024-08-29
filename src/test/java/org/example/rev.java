package org.example;

public class rev {

    public static void main(String[] args) {

        int num = 1234;
        while (num != 0) {
            System.out.println(num % 10);
            num = num / 10;
        }
    }
}