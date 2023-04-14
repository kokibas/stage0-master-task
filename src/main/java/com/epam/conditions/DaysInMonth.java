package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0 )){
            switch (month){
                case 1,3,12,10,5,7,8:
                    System.out.println(31);
                    break;
                case 6,4,11,9:
                    System.out.println(30);
                    break;
                case 2 :
                    System.out.println(29);
                    break;
                default:
                    System.out.println("invalid date");
                    break;

            }
        }else {
            switch (month){
                case 1,3,12,10,5,7,8:
                    System.out.println(31);
                    break;
                case 6,4,11,9:
                    System.out.println(30);
                    break;
                case 2 :
                    System.out.println(28);
                    break;
                default:
                    System.out.println("invalid date");
                    break;
        }
    }

}
}
