package org.example.OCP.avant;

public class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.width * r.height;
        } else if (shape instanceof Cercle) {
            Cercle c = (Cercle) shape;
            return Math.PI * c.radius * c.radius;
        }
        throw new IllegalArgumentException("Forme inconnue");
    }
}

