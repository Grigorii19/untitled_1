package ru.x5.Lesson3.task2;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Каша", "Дома", "Кот", "Пушок", 10);
        Dog dog = new Dog("Кости", "Будтка", "Собака", "Шарик", 12);
        Horse horse = new Horse("Сено", "Загон", "Лошадь", "Стрела", 15);

        System.out.println("Метод makeNoise: ");
        cat.makeNoise(cat.animal);
        dog.makeNoise(dog.animal);
        horse.makeNoise(horse.animal);

        System.out.println("\nFood и location пришедших животных на прием к ветеринару: ");
        Animal[] arr = {cat, dog, horse};

        for (Animal animal : arr) {

            Veterinarian veterinarian = new Veterinarian();
            veterinarian.treatAnimal(animal);
        }
    }
}
