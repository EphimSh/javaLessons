package lesson2.homework2;
import java.lang.Math;


public class homework2 {

    public static void main(String[] args) {
        checkSumIsBetweenTenAndTwenty(16, 5);
        checkSumIsPositive((int) ((Math.random() * 10) - 5));
        checkSumIsNegative((int) ((Math.random() * 10) - 5));
        printSomeTextAmountOfTimes("ayo", 10);
        leapYearCheck(401); //  TEST DATA: 3 - false, 4 - true, 100 - false, 104 - true,200 - false, 400 - true, 600 - false, 800 - true;
    }

    private static int checkSumIsBetweenTenAndTwenty(int a, int b) {
        int check = a + b;

        if (check >= 10 && check <= 20) {
            System.out.println("Sum is in the range");

        } else {
            System.out.println("sum is out of range");
        }
        return check;
    }

    private static int checkSumIsPositive(int a) {
        if (a >= 0) {
            System.out.println("Number is positive: " + a);
        } else {
            System.out.println("Number is negative: " + a);
        }
        return a;
    }

    private static boolean checkSumIsNegative(int a) {
        return a < 0;
    }

    private static void printSomeTextAmountOfTimes(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a + ": " + (i + 1));
        }
    }

    private static boolean leapYearCheck(int year) {

         /* if(year % 4 != 0){
            System.out.println("FALSE");
            return false;
        } else if (year % 100 != 0 && year % 400 != 0) {
            System.out.println("FALSE");
            return false;
        } else {
            System.out.println("TRUE");
        }*/

        /*if (year % 4 != 0 || year % 100 != 0 && year % 400 != 0){
            System.out.println("FALSE");
            return false;
        } else {
            System.out.println("TRUE");
        }
        return true;
    }*/
/*       boolean isLeapYear = (year % 4 == 0 || year % 400 == 0) || year % 100 == 0;
        System.out.println(isLeapYear);
        return isLeapYear;*/
        return (year % 4 == 0 || year % 400 == 0) || year % 100 == 0;
    }
}

}
