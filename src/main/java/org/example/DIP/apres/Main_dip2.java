package org.example.DIP.apres;

public class Main_dip2 {
    public static void main(String[] args) {
        Database database;

        database = new MySQLDatabase();
        OrderProcessor order = new OrderProcessor(database);
        order.processOrder("'Donnees a sauvegarder'");

        database = new MongoDBDatabase();
        OrderProcessor order1 = new OrderProcessor(database);
        order1.processOrder("'Donnees a sauvegarder'");
    }
}
