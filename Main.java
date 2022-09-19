package lesson7.javaLessons;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 20, false);
        Cat cat2 = new Cat("Marsik", 20, false);
        Cat cat3 = new Cat("Karsik", 20, false);
        Cat cat4 = new Cat("Jarsik", 20, false);
        Cat cat5 = new Cat("Rarsik", 22, false);


        Plate plate = new Plate(100);

        Cat[] cats = {cat1,cat2,cat3,cat4,cat5};
        for (Cat cat : cats){
            cat.eat(plate);
            cat.info();
            System.out.println("***");
            if(!cat.getSatiety()){
                plate.addFood();
                cat.eat(plate);
                cat.info();
                plate.info();
            }
        }





    }
}
