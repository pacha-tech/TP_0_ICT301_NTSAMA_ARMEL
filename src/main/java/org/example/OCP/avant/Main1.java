package org.example.OCP.avant;

public class Main1 {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Rectangle monRectangle = new Rectangle();
        Cercle monCercle = new Cercle();

        System.out.println("--- AVANT OCP ---");
        System.out.println("Aire Rectangle : " + calculator.calculateArea(monRectangle));
        System.out.println("Aire Cercle : " + calculator.calculateArea(monCercle));
    }
}

