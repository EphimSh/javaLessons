package lesson6.homework;

public class Main {
    /*
    1. Создать классы Собака и Кот с наследованием от класса Животное.
    2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль.
    (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.')
    3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
    4. * Добавить подсчет созданных котов, собак и животных.
    * */



    public static void main(String[] args) {
        Animal cat1 = new Cat("Barsik", "black");
        Animal cat2 = new Cat("Jack","Grey");
        Animal cat3 = new Cat("Hades", "black");
        Animal cat4 = new Cat("Tim","white");

        Animal dog1 = new Dog("Butch", "white");
        Animal dog2 = new Dog("Ferdinand", "black");
        Animal dog3 = new Dog("Buck", "yellow");
        Animal dog4 = new Dog("Hatchet", "grey");


        cat1.run(150);
        cat1.run(201);
        cat1.swim(-1);

        dog1.run(150);
        dog2.run(501);
        dog3.swim(-1);
        dog4.swim(7);
        dog1.swim(11);

        Animal.getCounter();
        Cat.getCounter();
        Dog.getCounter();


    }

}
