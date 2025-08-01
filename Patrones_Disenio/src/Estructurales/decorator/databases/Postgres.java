package Estructurales.decorator.databases;

public class Postgres implements Senteces{
    @Override
    public void select() {
        System.out.println("Select Postgrest");
    }
}
