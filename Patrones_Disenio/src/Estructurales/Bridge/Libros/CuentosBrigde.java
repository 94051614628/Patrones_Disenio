package Estructurales.Bridge.Libros;

import Estructurales.Bridge.Generos.Genero;
import Estructurales.Bridge.Generos.ICuentosBrigde;
import Estructurales.Bridge.Pasta.Blanda;
import Estructurales.Bridge.Pasta.Pasta;

public class CuentosBrigde extends LibrosBridge{
    public CuentosBrigde() {
        super(new Blanda(),new ICuentosBrigde());
    }

    @Override
    public String getEscritor() {
        return super.getEscritor();
    }

    @Override
    public void setEscritor(String escritor) {
        super.setEscritor(escritor);
    }

    @Override
    public Pasta getPasta() {
        return super.getPasta();
    }

    @Override
    public void setPasta(Pasta pasta) {
        super.setPasta(pasta);
    }

    @Override
    public Genero getGenero() {
        return super.getGenero();
    }

    @Override
    public void setGenero(Genero genero) {
        super.setGenero(genero);
    }
}
