package org.example.LSP.apres;

public class Main_lsp2 {
    public static void main(String[] args) {
        Shape square = new Square(3);
        Shape rectangle = new Rectangle(3,4);
        System.out.println("Square Area : "+square.getArea());
        System.out.println("Rectangle Area: "+rectangle.getArea());
    }
}
