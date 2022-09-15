package homework3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class homework3 {
    static final int SPECIAL_ARRAY_SIZE = 100;

    public static void main(String[] args) {

        switchingElementValuesArray();
        fillFromOneToHundred();
        lowerThanSixIsMultiplyByTwo();
        System.out.println("*********");
        diagonalFilledByOnePrint();
        System.out.println("*********");
        createSpecificIntArray(5, 6);
        findAndPrintMinAndMaxElementInArray();
        System.out.println("*********");
        System.out.println(checkBalance());
//        swapValue();



    }


    private static void switchingElementValuesArray() {
        int[] arr = {1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void fillFromOneToHundred() {
        int[] arr = new int[SPECIAL_ARRAY_SIZE];
        for (int i = 0; i < SPECIAL_ARRAY_SIZE; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void lowerThanSixIsMultiplyByTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    private static void diagonalFilledByOnePrint() {
        int[][] arr = new int[6][6];

        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if(j == i){
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }

            }
            System.out.println(Arrays.toString(arr[i]));
        }*/

/*        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if(i % 2 == j % 2){
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }*/

    /*    for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(j == i){
                    arr[i][i] = 1;
                    arr[i][arr.length - 1 - i] = 1;
                } else {
                    arr[j][j] = 0;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }*/
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == i || arr.length - 1 - i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[j][j] = 0;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }

    }

    private static void createSpecificIntArray(int len, int value) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;

        }
        System.out.println(Arrays.toString(arr));
    }

    private static void findAndPrintMinAndMaxElementInArray() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        int max = arr[0];
        int min = arr[0];

        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) max = arr[i];

        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) min = arr[i];
        }
        System.out.println(max);
        System.out.println(min);
    }

    private static boolean checkBalance() {

        int[] arr = new int[10];
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(arr));
        // Array is created and ready to go.

        //Creating sum of left side of an array
        for (int i = 0; i < (arr.length / 2); i++) {
            sumLeft += arr[i];
        }
        //Creating sum of right side of an array
        for (int i = (arr.length / 2); i < arr.length; i++) {
            sumRight += arr[i];
        }
        // Checking balance of an array
        if (sumLeft == sumRight) {
            return true;
        } else {
            return false;
        }


    }

}
