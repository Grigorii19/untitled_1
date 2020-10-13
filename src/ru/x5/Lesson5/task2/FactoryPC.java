package ru.x5.Lesson5.task2;

public class FactoryPC {
    private String component;

    public FactoryPC(String component) {
        this.component = component;
    }

    public ComponentFactory getComponent() {
        switch (component) {
            case "CPU":
                return new CPU();
            case "RAM":
                return new RAM();
            case "GraphicCard":
                return new GraphicCard();
            case "HDD":
                return new HDD();
            case "Monitor":
                return new Monitor();
            default:
                return null;
        }
    }
}