package Creacionales.FactoryMethod;

public class NovelasFactoryMethod extends LibroFactoryMethod{
    @Override
    public LibrosMethod crearLibro() {
        return new LibroNovelasMethod();
    }
}
