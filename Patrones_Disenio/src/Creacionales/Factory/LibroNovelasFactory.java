package Creacionales.Factory;

public class LibroNovelasFactory implements LibrosFactory {
    @Override
    public void leerLibro() {
        System.out.println("Leyendo el libro de Novelas");
    }
}
