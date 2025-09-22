package Comportamentales.Command.Databases;

public class Sql implements Sentences{
    @Override
    public void select() {
        System.out.println("Select SQL");
    }

    @Override
    public void created() {
        System.out.println("Create SQL");
    }

    @Override
    public void delete() {
        System.out.println("Delete SQL");
    }

    @Override
    public void update() {
        System.out.println("Update SQL");
    }
}
