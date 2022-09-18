package lesson6.homework;

public class Cat extends Animal{

    static int counter;

    public Cat(String name, String color) {
        super(name, color);
        counter++;
    }



    @Override
    public void run(int distance) {
        super.run(distance);
        if(distance > 200){
            System.out.printf("%s the Cat cannot run more than %s meters%n", getName(), 200);
        } else {
            System.out.printf("%s the Cat run this distance of %s meters, as fast as a cat can do%n", getName(), distance);
        }
    }
    public void swim(int distance){
        super.swim(distance);

        System.out.printf("For your notice %s the Cat cannot swim%n", getName());
    }

    public static int getCounter(){
        System.out.printf("Total cats: %s%n", counter);
        return counter;
    }
}
