package Creacionales.FactoryMethod;

public class TestFactoryMethod {
    public static void main(String[] args) {
        LibrosMethod novela = new NovelasFactoryMethod().crearLibro();
        LibrosMethod cuento = new CuentosFactoryMethod().crearLibro();

        novela.leerLibro();
        cuento.leerLibro();
    }
}
