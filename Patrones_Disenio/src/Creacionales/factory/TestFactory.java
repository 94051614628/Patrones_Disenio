package Creacionales.factory;

public class TestFactory {
    public static void main(String[] args) {
        LibroFactory libroFactory = new LibroFactory();
        LibrosFactory cuentos = libroFactory.createLibro("CUENTOS");
        LibrosFactory novelas = libroFactory.createLibro("NOVELAS");

        cuentos.leerLibro();
        novelas.leerLibro();
    }
}
