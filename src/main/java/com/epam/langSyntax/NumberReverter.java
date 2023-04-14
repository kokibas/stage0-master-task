package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int rev = 0;
        while (number > 0){
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        System.out.println(rev);
    }

}
