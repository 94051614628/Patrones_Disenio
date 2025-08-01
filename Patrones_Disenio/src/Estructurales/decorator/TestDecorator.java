package Estructurales.decorator;

import Estructurales.decorator.databases.Mongo;
import Estructurales.decorator.databases.Postgres;
import Estructurales.decorator.decorator.MongoDecorator;
import Estructurales.decorator.decorator.SQLDecorater;

public class TestDecorator {
    public static void main(String[] args) {
        System.out.println("--- Sentencia SQL y Mongo ");
        var query1 = new SQLDecorater(new Mongo());
        query1.select();

        System.out.println("---Sentencia las tres bases---");
        var query2 = new SQLDecorater(new MongoDecorator(new Postgres()));
        query2.select();

    }
}
