package Creacionales.AbstractFactory.Abstract;

import Creacionales.AbstractFactory.Letra.HelveticaAbstract;
import Creacionales.AbstractFactory.Letra.LetraAbstract;
import Creacionales.AbstractFactory.Libros.LibrosAbstract;
import Creacionales.AbstractFactory.Libros.NovelasAbstract;
import Creacionales.AbstractFactory.Pasta.BlandaAbstract;
import Creacionales.AbstractFactory.Pasta.PastaAbstract;

public class NovelasAbstractFactory extends   LibrosFactoryAbstract{
    @Override
    public LibrosAbstract crearLibro() {
        return new NovelasAbstract();
    }

    @Override
    public LetraAbstract crearLetra() {
        return new HelveticaAbstract();
    }

    @Override
    public PastaAbstract crearPasta() {
        return new BlandaAbstract();
    }
}
