package org.example;

public class Sharedint {

    public static void hasSharedDigit(int x, int y) {


        int xFirst = x / 10;
        int yFirst = y / 10;
        int xLast = x % 10;
        int yLast = y % 10;

        if ((xFirst == yFirst || xLast == yLast) || (xFirst == yLast || xLast == yFirst)) {
            // return true;
            System.out.println("match");

        } else {
            System.out.println("no match");
        }
    }

    public static void main(String[] args) {


        Sharedint.hasSharedDigit(36, 67);
    }
}