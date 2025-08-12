package Estructurales.Flyweight.tables;

import java.util.HashMap;
import java.util.Map;

public class FactoryTable {
    private static Map<Integer,Table> factoryTables = new HashMap<>();

    public static Table getTable(Table table){
        if (!factoryTables.containsKey(table.getId())){
            factoryTables.put(table.getId(),table);
        }
        return factoryTables.get(table.getId());
    }
}
