package Estructurales.Bridge.Libros;

import Estructurales.Bridge.Generos.Genero;
import Estructurales.Bridge.Pasta.Pasta;

public abstract  class LibrosBridge {
    protected String escritor;
    protected Pasta pasta;
    protected Genero genero;

    protected LibrosBridge( Pasta pasta, Genero genero){
        this.pasta = pasta;
        this.genero= genero;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public Pasta getPasta() {
        return pasta;
    }

    public void setPasta(Pasta pasta) {
        this.pasta = pasta;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
