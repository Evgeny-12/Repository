package animal.main;

import animal.bird.Duck;
import animal.pets.Animal;
import animal.pets.Cat;
import animal.pets.Dog;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // Перечисление для команд
    enum Command {
        ADD, LIST, EXIT
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        while (true) {
            // Выводим меню на экран
            System.out.println("Введите команду (add/list/exit):");
            String input = scanner.nextLine().trim().toUpperCase(); // Чтение команды и преобразование к верхнему регистру

            // Обработка введенной команды
            Command command;
            try {
                command = Command.valueOf(input); // Преобразуем строку в значение перечисления
            } catch (IllegalArgumentException e) {
                System.out.println("Некорректная команда. Попробуйте снова.");
                continue;
            }

            switch (command) {
                case ADD:
                    addAnimal(scanner, animals);
                    break;
                case LIST:
                    listAnimals(animals);
                    break;
                case EXIT:
                    System.out.println("Выход из программы.");
                    return;
            }
        }
    }
    private static void addAnimal(Scanner scanner, ArrayList<Animal> animals) {
        System.out.println("Какое животное? (cat/dog/duck):");
        String type = scanner.nextLine().trim().toLowerCase();

        System.out.println("Введите имя:");
        String name = scanner.nextLine().trim();

        int age;
        try {
            System.out.println("Введите возраст:");
            age = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после ввода числа
        } catch (InputMismatchException e) {
            System.out.println("Некорректный возраст. Пожалуйста, введите целое число.");
            scanner.nextLine(); // Очистка буфера после ввода некорректного значения
            return;
        }

        double weight;
        try {
            System.out.println("Введите вес:");
            weight = scanner.nextDouble();
            scanner.nextLine(); // Очистка буфера после ввода числа
        } catch (InputMismatchException e) {
            System.out.println("Некорректный вес. Пожалуйста, введите число.");
            scanner.nextLine(); // Очистка буфера после ввода некорректного значения
            return;
        }

        System.out.println("Введите цвет:");
        String color = scanner.nextLine().trim();

        Animal animal;
        switch (type) {
            case "cat":
                animal = new Cat(name, age, weight, color);
                break;
            case "dog":
                animal = new Dog(name, age, weight, color);
                break;
            case "duck":
                animal = new Duck(name, age, weight, color);
                break;
            default:
                System.out.println("Некорректный тип.");
                return;
        }
        animals.add(animal);
        animal.say();
    }

    // Логика для команды LIST
    private static void listAnimals(ArrayList<Animal> animals) {
        System.out.println("Список животных:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}