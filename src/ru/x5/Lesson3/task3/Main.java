package ru.x5.Lesson3.task3;

public class Main {

    public static void main(String[] args) {

        Student[] studArr = new Student[4];

        studArr[0] = new Student("Женя", "Ларин", "A", 11);
        studArr[1] = new Student("Вова", "Зобнин", "B", 4);
        studArr[2] = new Aspirant("Коля", "Манохин", "C", 3);
        studArr[3] = new Aspirant("Дима", "Кошкин", "D", 2);

        for (Student student : studArr) {

            student.getScholarship();
        }

        System.out.println();
    }
}
