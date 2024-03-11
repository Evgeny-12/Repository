package animal.pets;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, int age, double weight, String color) {
        super();
    }

    @Override
    public void say() {
        System.out.println("Гав!");
    }
}
