package Estructurales.decorator.databases;

public class SQL implements Senteces{
    @Override
    public void select() {
        System.out.println("Select SQL");
    }
}
