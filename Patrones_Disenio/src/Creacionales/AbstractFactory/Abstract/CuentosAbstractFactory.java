package Creacionales.AbstractFactory.Abstract;

import Creacionales.AbstractFactory.Letra.CursivaAbstract;
import Creacionales.AbstractFactory.Letra.LetraAbstract;
import Creacionales.AbstractFactory.Libros.CuentosAbstract;
import Creacionales.AbstractFactory.Libros.LibrosAbstract;
import Creacionales.AbstractFactory.Pasta.DuraAbstract;
import Creacionales.AbstractFactory.Pasta.PastaAbstract;

public class CuentosAbstractFactory extends LibrosFactoryAbstract{
    @Override
    public LibrosAbstract crearLibro() {
        return new CuentosAbstract();
    }

    @Override
    public LetraAbstract crearLetra() {
        return  new CursivaAbstract();
    }

    @Override
    public PastaAbstract crearPasta() {
        return new DuraAbstract();
    }
}
