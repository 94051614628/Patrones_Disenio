package Creacionales.AbstractFactory.Libros;

public class CuentosAbstract implements LibrosAbstract{
    @Override
    public void tipoDeLibro() {
        System.out.println("Libro de Cuentos");
    }
}
