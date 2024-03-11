package animal.pets;

public class Animal {
    private String name;
    private int age;
    private double weight;
    private String color;

    public Animal() {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Методы
    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        String ageString;
        if (age == 1) {
            ageString = "год";
        } else if (age % 10 >= 2 && age % 10 <= 4 && (age < 10 || age > 20)) {
            ageString = "года";
        } else {
            ageString = "лет";
        }
        return "Привет! Меня зовут " + name + ", мне " + age + " " + ageString +
                ", я вешу - " + weight + " кг, мой цвет - " + color;
    }


}

