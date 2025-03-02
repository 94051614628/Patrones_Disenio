package Creacionales.FactoryMethod;

public class CuentosFactoryMethod extends LibroFactoryMethod{
    @Override
    public LibrosMethod crearLibro() {
        return new  LibroCuentosMethod();
    }
}
