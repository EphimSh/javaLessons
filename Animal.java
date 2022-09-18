package lesson6.homework;

public abstract class Animal {
    private String name;
    private String color;
    static int counter;


    //creating a constructor
    public Animal(String name, String color){
        this.name = name;
        this.color = color;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public static int getCounter() {
        System.out.printf("Total animals: %s%n", counter);
        return counter;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //creating methods that extend to other classes
    public void run(int distance){
        if(distance < 0){
            System.out.println("Error, wrong input");
        }
    }
    public void swim(int distance){
        if(distance < 0){
            System.out.println("Error, wrong input");
        }
    }

}
