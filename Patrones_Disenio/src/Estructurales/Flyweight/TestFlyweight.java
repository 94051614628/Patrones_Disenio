package Estructurales.Flyweight;

import Estructurales.Flyweight.databases.Databases;
import Estructurales.Flyweight.tables.FactoryTable;
import Estructurales.Flyweight.tables.Table;

public class TestFlyweight {
    public static void main(String[] args) {
        Table table1 = new Table(1,"Costos",4);
        Table table2 = new Table(2,"Articulos",10);
        Table table3 = new Table(3,"Stock",15);

        FactoryTable.getTable(table1);
        FactoryTable.getTable(table2);
        FactoryTable.getTable(table3);

        var database1 = new Databases("No SQL","Mongo");

        database1.addTable(FactoryTable.getTable(table1));
        database1.addTable(FactoryTable.getTable(table2));
        database1.addTable(FactoryTable.getTable(table3));

        System.out.println("---Mongo---");
        database1.printTables();

        var database2 = new Databases("SQL","Postgres");

        database2.addTable(FactoryTable.getTable(table1));
        database2.addTable(FactoryTable.getTable(table2));
        database2.addTable(FactoryTable.getTable(table3));
        database2.addTable(FactoryTable.getTable(new Table(1,"Clase",10)));
        database2.addTable(FactoryTable.getTable(new Table(4,"Clase",10)));


        System.out.println("---Postgres---");
        database2.printTables();

    }
}
