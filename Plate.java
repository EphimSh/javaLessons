package lesson7.javaLessons;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    // n = Cat.appetite
    public boolean decreaseFood(int n) {

        if (food < n) {
            System.out.printf("Hold on mr.Cat, starting adding food process%n");
        } else {
            food -= n;
            return true;
        }
        return false;
    }

    public void addFood(){
        this.food += 100;
        System.out.println("Food added");
    }

    public void info() {
        System.out.println("Plate: " + food);

    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
