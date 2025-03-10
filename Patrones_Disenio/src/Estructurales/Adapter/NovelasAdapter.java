package Estructurales.Adapter;

public class NovelasAdapter implements  ILibroAdapter{
    @Override
    public void getPaginas() {
        System.out.println("Numero 10 ");
    }

    @Override
    public void getISBN() {
        System.out.println("356354616");
    }
}
