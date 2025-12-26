package org.example.OCP.apres;

public class Cercle implements Shape{
    private double radius;

    public Cercle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
