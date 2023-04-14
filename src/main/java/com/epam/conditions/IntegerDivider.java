package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if ( divider != 0){
        int res = dividend / divider;
        int res1 = divider * res;
          if (res1 != dividend) {
            System.out.println("cannot be divided completely");
        }else {
            System.out.println("can be divided completely");
        }
        }else {
            System.out.println("division by zero");
        }
    }

}
