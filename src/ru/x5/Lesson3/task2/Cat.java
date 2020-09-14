package ru.x5.Lesson3.task2;

public class Cat extends Animal {

    public String animal, name;
    public int age;

    public void sCat(String animal, String name, int age) {

        this.animal = animal;
        this.name = name;
        this.age = age;
    }

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise(String animal) {

        System.out.println(animal + " мурлыкает");
    }

    @Override
    public void eat(String animal) {

        System.out.println(animal + " ест " + food);
    }
}