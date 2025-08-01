package Estructurales.decorator.decorator;

import Estructurales.decorator.databases.Senteces;

public class MongoDecorator extends DatabaseDecorator{
    public MongoDecorator(Senteces sentences) {
        super(sentences);
    }

    @Override
    public void select() {
        super.select();
        System.out.println("Select Mongo Decorator");
    }
}
