package animal.pets;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, int age, double weight, String color) {
        super();
    }

    @Override
    public void say() {
        System.out.println("Мяу!");
    }
}
