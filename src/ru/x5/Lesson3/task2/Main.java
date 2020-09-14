package ru.x5.Lesson3.task2;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Каша", "Дома");
        cat.sCat("Кот", "Пушок", 8);

        Dog dog = new Dog("Кости", "Вольер");
        dog.sDog("Собака", "Шарик", 10);

        Horse horse = new Horse("Сено", "Загон");
        horse.sHorse("Лошадь", "Стрела", 9);

        Animal[] arr = new Animal[3];
        arr[0] = cat;
        arr[1] = dog;
        arr[2] = horse;

        for (Animal animal : arr) {

            Veterinarian veterinarian = new Veterinarian();
            veterinarian.treatAnimal(animal);
        }

        System.out.println(arr[0]);
    }
}
