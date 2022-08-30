package lesson1.homework;
import java.lang.Math;
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("**************");
        checkSumSign();
        System.out.println("**************");
        printColor();
        System.out.println("**************");
        compareNumbers();
    }



    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void  checkSumSign(){
        int a = (int) ((Math.random() - 0.3) * 10);
        int b = (int) ((Math.random() - 0.1) * 10);

        if ((a + b) >= 0) {
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("a + b = " + (a+b) + " Сумма положительная");
        } else if ((a + b) < 0) {
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("a + b = " + (a+b) + " Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value =  (int) ((Math.random() - 0.2) * 150);

        if(value <= 0) {
            System.out.println( value + " Красный");
        } else if (value > 0 &&  value <= 100) {
            System.out.println( value + " Желтый");
        } else if (value > 100 ){
            System.out.println( value + " Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        if(a>=b){
            System.out.println("a = "+ a);
            System.out.println("b = "+ b);
            System.out.println("a >= b");
        } else {
            System.out.println("a = "+ a);
            System.out.println("b = "+ b);
            System.out.println("a < b");
        }
    }

}
