package Estructurales.Flyweight.tables;


public class Table {
    private  Integer id;
    private String name;
    private Integer countColumn;

    public Table(Integer id,String name, Integer countColumn) {
        this.id = id;
        this.name = name;
        this.countColumn = countColumn;
    }

    public  Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", countColumn=" + countColumn +
                '}'+"Save: "+ System.identityHashCode(this);
    }
}
