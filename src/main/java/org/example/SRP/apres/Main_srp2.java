package org.example.SRP.apres;

public class Main_srp2 {
    public static void main(String[] args){
        BookSRP bookSRP = new BookSRP("maths","pacha","mathematiques");
        BookSaver bookSaver = new BookSaver();
        BookPrinter bookPrinter = new BookPrinter();
        BookBusinessLogic bookBusinessLogic = new BookBusinessLogic();

        bookPrinter.printToHTML(bookSRP);
    }
}
