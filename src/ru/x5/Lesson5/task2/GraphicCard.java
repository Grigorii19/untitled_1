package ru.x5.Lesson5.task2;

public class GraphicCard extends ComponentFactory implements ComponentsPC {
    private String manufacturer;
    private TypeRAMGC typeRAMGC;
    private int size;
    private CoolingGC coolingGC;

    public GraphicCard() {
    }

    public GraphicCard(String manufacturer, TypeRAMGC typeRAMGC, int size, CoolingGC coolingGC) {
        this.manufacturer = manufacturer;
        this.typeRAMGC = typeRAMGC;
        this.size = size;
        this.coolingGC = coolingGC;
    }

    @Override
    public String toString() {
        return "GraphicCard: manufacturer - " + manufacturer + "; typeRAMGC - " + typeRAMGC + "; size - " + size + "; coolingGC - " + coolingGC + ";";
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}