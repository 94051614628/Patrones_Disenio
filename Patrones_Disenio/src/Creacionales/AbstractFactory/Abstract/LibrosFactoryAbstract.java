package Creacionales.AbstractFactory.Abstract;

import Creacionales.AbstractFactory.Letra.LetraAbstract;
import Creacionales.AbstractFactory.Libros.LibrosAbstract;
import Creacionales.AbstractFactory.Pasta.PastaAbstract;

public abstract class LibrosFactoryAbstract {
    public abstract LibrosAbstract crearLibro();
    public abstract LetraAbstract crearLetra();
    public abstract PastaAbstract crearPasta();
}
