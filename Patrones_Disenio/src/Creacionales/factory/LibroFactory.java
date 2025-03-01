package Creacionales.factory;

public class LibroFactory {
    public LibrosFactory createLibro(String type){

        if (type.equalsIgnoreCase("CUENTOS")){
           return new LibroCuentosFactory();
        } else if (type.equalsIgnoreCase("NOVELAS")) {
            return new LibroNovelasFactory();
        }
        return null;
    }
}
