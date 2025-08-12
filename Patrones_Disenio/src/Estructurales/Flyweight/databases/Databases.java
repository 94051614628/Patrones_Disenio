package Estructurales.Flyweight.databases;

import Estructurales.Flyweight.tables.Table;

import java.util.ArrayList;
import java.util.List;

public class Databases {
    private String name;
    private String type;
    private List<Table> tableList;

    public Databases(String type, String name) {
        this.type = type;
        this.name = name;
        this.tableList= new ArrayList<>();
    }

    public void addTable(Table table){
        tableList.add(table);
    }

    public void  printTables(){
        tableList.forEach(System.out::println);
    }
}
