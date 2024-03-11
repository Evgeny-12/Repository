package animal.bird;

import animal.pets.Animal;

public class Duck extends Animal implements Flying {

    public Duck() {
    }

    public Duck(String name, int age, double weight, String color) {
        super();
    }

    @Override
    public void say() {
        System.out.println("Кря!");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу!");
    }
}
