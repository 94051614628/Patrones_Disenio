package Creacionales.AbstractFactory;

import Creacionales.AbstractFactory.Abstract.CuentosAbstractFactory;
import Creacionales.AbstractFactory.Abstract.LibrosFactoryAbstract;
import Creacionales.AbstractFactory.Abstract.NovelasAbstractFactory;
import Creacionales.AbstractFactory.Letra.LetraAbstract;
import Creacionales.AbstractFactory.Libros.LibrosAbstract;
import Creacionales.AbstractFactory.Pasta.PastaAbstract;

public class TestAbstractFactory {
    public static void main(String[] args) {

        // Libro de Cuentos
        System.out.println("Cuentos");
        LibrosFactoryAbstract fabrica = new CuentosAbstractFactory();
        LetraAbstract letraCuentos  = fabrica.crearLetra();
        LibrosAbstract libroCuentos = fabrica.crearLibro();
        PastaAbstract pastaCuentos = fabrica.crearPasta();

        letraCuentos.tipodeDetra();
        libroCuentos.tipoDeLibro();
        pastaCuentos.tipoDePasta();

        // Libro de Novelas
        System.out.println("Novelas");
        fabrica = new NovelasAbstractFactory();
        LetraAbstract letraNovelas = fabrica.crearLetra();
        LibrosAbstract libroNovelas = fabrica.crearLibro();
        PastaAbstract pastaNovelas = fabrica.crearPasta();

        letraNovelas.tipodeDetra();
        libroNovelas.tipoDeLibro();
        pastaNovelas.tipoDePasta();


    }
}
