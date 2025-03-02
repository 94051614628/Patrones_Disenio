package Creacionales.FactoryMethod;

public class LibroCuentosMethod implements LibrosMethod {
    @Override
    public void leerLibro() {
        System.out.println("Leyendo el libro de Cuentos");
    }
}
