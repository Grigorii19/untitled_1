package ru.x5.Lesson5.task1;

public class DbLogger extends Logger {
    @Override
    public Input log(String message) {
        return new DataBase();
    }
}