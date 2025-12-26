package org.example.OCP.apres;

public class Main2 {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Utilisation du polymorphisme
        Shape rect = new Rectangle(10, 5);
        Shape circ = new Cercle(7);

        System.out.println("--- APRÈS OCP ---");
        System.out.println("Aire Rectangle : " + calculator.calculate(rect));
        System.out.println("Aire Cercle : " + calculator.calculate(circ));

        // Preuve de l'OCP : On peut ajouter un Triangle sans toucher à AreaCalculator
        Shape tri = new Shape() {
            @Override public double getArea() { return (10 * 5) / 2.0; }
        };
        System.out.println("Aire Triangle (ajouté sans modif) : " + calculator.calculate(tri));
    }
}


