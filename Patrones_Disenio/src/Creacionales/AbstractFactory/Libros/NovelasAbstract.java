package Creacionales.AbstractFactory.Libros;

public class NovelasAbstract implements LibrosAbstract{
    @Override
    public void tipoDeLibro() {
        System.out.println("Libro de Novelas");
    }
}
