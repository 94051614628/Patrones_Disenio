package Creacionales.Singleton;

public class TestSingleton {
    public static void main(String[] args) {
        LibroSingleton libro  = LibroSingleton.getLibro("Mario Mendoza");
        System.out.println(libro.toString());

        libro = LibroSingleton.getLibro("Carlos Sanbrabo");
        System.out.println(libro.toString());

    }
}
