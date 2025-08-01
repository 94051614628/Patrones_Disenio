package Estructurales.decorator.decorator;

import Estructurales.decorator.databases.Senteces;

public class PostgresDecorator extends DatabaseDecorator{
    public PostgresDecorator(Senteces sentences) {
        super(sentences);
    }

    @Override
    public void select() {
        super.select();
        System.out.println("Select Postgres Decorator");
    }
}
