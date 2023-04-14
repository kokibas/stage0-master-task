package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        double check = firstSide + secondSide;
        double check1 = firstSide +thirdSide;
        double check2 = thirdSide + secondSide;
        if (check > thirdSide && check1 > secondSide && check2 > firstSide){
            System.out.println("this is a valid triangle");
        }else {
            System.out.println("it's not a triangle");
        }

    }

}
