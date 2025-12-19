package org.example.SRP.avant;

public class main {
    public static void main(String[] args) {
        Book book = new Book("Les principes SOLID", "Etudiants de ICTL3-GL", "Révision des principes SOLID");
        book.printToScreen();
        book.saveToDatabase();
        book.emprunter("Marcial");
    }
}
