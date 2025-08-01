package Estructurales.decorator.decorator;

import Estructurales.decorator.databases.Senteces;

public abstract class DatabaseDecorator implements Senteces {
    protected Senteces sentences;

    public DatabaseDecorator(Senteces sentences) {
        this.sentences = sentences;
    }

    @Override
    public void select(){
        sentences.select();
    }
}
