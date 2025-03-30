package Estructurales.Bridge.Libros;

import Estructurales.Bridge.Generos.Genero;
import Estructurales.Bridge.Generos.IEnciclopediaBrigde;
import Estructurales.Bridge.Pasta.Dura;
import Estructurales.Bridge.Pasta.Pasta;

public class EnciclopediaBrigde extends LibrosBridge{
    public EnciclopediaBrigde() {
        super(new Dura(), new IEnciclopediaBrigde());
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
