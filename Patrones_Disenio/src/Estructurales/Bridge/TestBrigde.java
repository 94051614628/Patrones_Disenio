package Estructurales.Bridge;

import Estructurales.Bridge.Generos.ICuentosBrigde;
import Estructurales.Bridge.Generos.IEnciclopediaBrigde;
import Estructurales.Bridge.Generos.IFiccionBrigde;
import Estructurales.Bridge.Libros.CuentosBrigde;
import Estructurales.Bridge.Libros.EnciclopediaBrigde;
import Estructurales.Bridge.Libros.FiccionBrigde;
import Estructurales.Bridge.Pasta.Blanda;
import Estructurales.Bridge.Pasta.Dura;

public class TestBrigde {
    public static void main(String[] args) {
        /*
        * En este partron  se debe separar la abstraccion de la implementacion
        * por ellos un liro de enciclopedia o de ficcion puede ser de cuentos.
        * */
        System.out.println("*****Enciclopedia****");
        EnciclopediaBrigde  enciclopediaBrigde = new EnciclopediaBrigde();
        enciclopediaBrigde.setEscritor("Ed Morgan");
        enciclopediaBrigde.getGenero().tipo();
        enciclopediaBrigde.getPasta().tipo();
        enciclopediaBrigde.setGenero(new ICuentosBrigde());
        enciclopediaBrigde.setPasta(new Blanda());
        enciclopediaBrigde.getGenero().tipo();
        enciclopediaBrigde.getPasta().tipo();

        System.out.println("*****Cuentos****");
        CuentosBrigde cuentosBrigde = new CuentosBrigde();
        cuentosBrigde.setEscritor("Laura Set");
        cuentosBrigde.getGenero().tipo();
        cuentosBrigde.getPasta().tipo();
        cuentosBrigde.setGenero(new IEnciclopediaBrigde());
        cuentosBrigde.setPasta(new Dura());
        cuentosBrigde.getGenero().tipo();
        cuentosBrigde.getPasta().tipo();


        System.out.println("*****Cuentos****");
        FiccionBrigde ficcionBrigde = new FiccionBrigde();
        ficcionBrigde.setEscritor("Carlos mente");
        ficcionBrigde.getGenero().tipo();
        ficcionBrigde.getPasta().tipo();
        ficcionBrigde.setPasta(new Blanda());
        ficcionBrigde.setGenero(new ICuentosBrigde());
        ficcionBrigde.getGenero().tipo();
        ficcionBrigde.getPasta().tipo();


    }
}
