package Estructurales.decorator.databases;

public class Mongo implements Senteces{

    @Override
    public void select() {
        System.out.println("Select Mongo");
    }
}
