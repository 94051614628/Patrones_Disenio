package Creacionales.Singleton;

public class LibroSingleton {
    private  String author;
    private static  LibroSingleton libro;

    private LibroSingleton(String author){
        this.author = author;
    }

    public static LibroSingleton getLibro(String author){
        if(libro == null){
            libro  = new LibroSingleton(author);
        }
        return libro;
    }

    @Override
    public String toString() {
        return "LibroSingleton{" +
                "author='" + author + '\'' +
                '}';
    }
}
