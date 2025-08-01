package Estructurales.decorator.decorator;

import Estructurales.decorator.databases.Senteces;

public class SQLDecorater extends  DatabaseDecorator{
    public SQLDecorater(Senteces sentences) {
        super(sentences);
    }

    @Override
    public void select() {
        super.select();
        System.out.println("Select SQL Decorator");
    }
}
