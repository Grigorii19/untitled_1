package ru.x5.Lesson5.task2;

public class FacadePC {
    public CPU cpu = new CPU();
    public RAM ram = new RAM();
    public GraphicCard gc = new GraphicCard();
    public HDD hdd = new HDD();
    public Monitor monitor = new Monitor();

    public void createPC() {
        cpu.output();
        ram.output();
        gc.output();
        hdd.output();
        monitor.output();
    }
}