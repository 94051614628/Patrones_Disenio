package Creacionales.Prototype;

import Creacionales.Builder.Libro;

public class TestPrototype {
    public static void main(String[] args) {
        LibroPrototype libro = new NovelasPrototype("Novelas","Carlos S","Niños");

        LibroPrototype libroNovela2 = libro.clone();
        libroNovela2.setEscritor("Andrea Arengas");



        System.out.println(libro.toString());
        System.out.println(libroNovela2.toString());
    }
}
