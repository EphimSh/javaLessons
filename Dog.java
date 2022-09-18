package lesson6.homework;

public class Dog extends Animal{

    static int counter;

    public Dog(String name, String color) {
        super(name, color);
        counter++;
    }

    @Override
    public void run(int distance) {
        super.run(distance);
        if(distance > 500){
            System.out.printf("Your beloved dog %s cannot run more than %s meters%n", getName(), 500);
        } else {
            System.out.printf("%s the Dog is finished the distance as fast as a dog can do%n", getName());
        }
    }

    @Override
    public void swim(int distance) {
        super.swim(distance);
        if(distance > 10){
            System.out.printf("For your notice %s the Dog cannot swim more than %s meters%n", getName(),10);
        } else if (distance < 10 && distance > 0) {
            System.out.printf("%s swam your bloddy distance of %s meters, please stop torturing animals%n", getName(), distance);
        }

    }
    public static int getCounter(){
        System.out.printf("Total dogs: %s%n", counter);
        return counter;
    }
}
