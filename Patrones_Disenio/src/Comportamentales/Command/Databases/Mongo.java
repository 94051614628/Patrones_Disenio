package Comportamentales.Command.Databases;



public class Mongo implements Sentences {

    @Override
    public void select() {
        System.out.println("Select Mongo");
    }

    @Override
    public void created() {
        System.out.println("Create Mongo");
    }

    @Override
    public void delete() {
        System.out.println("Delete Mongo");
    }

    @Override
    public void update() {
        System.out.println("Update Mongo");
    }
}
