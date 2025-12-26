package org.example.OCP.apres;

public class AreaCalculator {
    public double calculate(Shape shape) {
        // Cette ligne ne changera JAMAIS, même si on ajoute 100 formes
        return shape.getArea();
    }
}
