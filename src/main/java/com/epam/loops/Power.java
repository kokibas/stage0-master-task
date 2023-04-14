package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int c = 1;
        for (int i = 0; i < power; i++) {
            c *= numberToPrint;
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
