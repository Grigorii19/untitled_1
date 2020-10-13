package ru.x5.Lesson5.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Pattern - Strategy");
        Strategy comp1 = new Strategy();
        comp1.setComponentsPC(new CPU(1500, 2, 1024, "i5", "Intel"));
        comp1.createComponent();
        Strategy comp2 = new Strategy();
        comp2.setComponentsPC(new HDD("Huawei", 1000, TypeHDD.HDD, FormFactorHDD.LFF));
        comp2.createComponent();
        Strategy comp3 = new Strategy();
        comp3.setComponentsPC(new GraphicCard("NVidia", TypeRAMGC.DDR,1000, CoolingGC.passive));
        comp3.createComponent();
        Strategy comp4 = new Strategy();
        comp4.setComponentsPC(new RAM("XPG", 16000, 2133, TypeRAM.DDR4));
        comp4.createComponent();
        Strategy comp5 = new Strategy();
        comp5.setComponentsPC(new Monitor("Acer"));
        comp5.createComponent();
        System.out.println("");

        System.out.println("Pattern - Facade");
        FacadePC pcNew = new FacadePC();
        pcNew.createPC();

        System.out.println("\nPattern - Factory \nВведите компонет компьютера:");
        Scanner sc = new Scanner(System.in);
        String component = sc.nextLine();
        FactoryPC createprogram = new FactoryPC(component);
        if (createprogram != null) {
            createprogram.getComponent().output();
        }
        else{
            System.out.println("Компонент не найден");
        }

    }
}