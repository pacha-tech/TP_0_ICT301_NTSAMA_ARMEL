package org.example.DIP.apres;

public class MySQLDatabase implements Database{
    @Override
    public void save(String data) {
        System.out.println("Saving to MySQL: "+data);
    }
}
