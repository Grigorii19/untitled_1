package ru.x5.Lesson3.task3;

public class Student {
    protected String firstName;
    private String lastName, group;
    protected double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void getScholarship() {

        if (averageMark == 5) {

            System.out.println(firstName + " стипендия = " + 100);

        } else {

            System.out.println(firstName + " стипендия = " + 80);
        }
    }
}
