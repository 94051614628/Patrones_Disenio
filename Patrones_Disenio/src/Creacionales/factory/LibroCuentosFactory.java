package Creacionales.factory;

public class LibroCuentosFactory implements LibrosFactory {
    @Override
    public void leerLibro() {
        System.out.println("Leyendo el libro de Cuentos");
    }
}
