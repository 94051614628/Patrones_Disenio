package Creacionales.Factory;

public class LibroCuentosFactory implements LibrosFactory {
    @Override
    public void leerLibro() {
        System.out.println("Leyendo el libro de Cuentos");
    }
}
