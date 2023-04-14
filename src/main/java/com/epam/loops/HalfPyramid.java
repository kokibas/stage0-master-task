package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = cathetusLength - 1; i >= 0; i--){
            for(int k = 0; k < i; k++){
                System.out.print(" ");
            }
            for (int j = i; j <= cathetusLength - 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
