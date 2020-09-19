package ru.x5.Lesson3.task1;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone(7888111, "iPhone", 11);
        Phone phone2 = new Phone(7888222, "Nokia",12);
        Phone phone3 = new Phone(7888333,"Samsung",13);

        phone1.receiveCall("Boris");
        phone2.receiveCall("Vlad");
        phone3.receiveCall("McGregor");

        System.out.println("Номер телефона: " + phone1.getNumber());
        System.out.println("Номер телефона: " + phone2.getNumber());
        System.out.println("Номер телефона: " + phone3.getNumber());

        phone1.receiveCall("Boris", 7888111);
        phone1.sendMessage(7888111, 7888222, 7888333);
    }
}