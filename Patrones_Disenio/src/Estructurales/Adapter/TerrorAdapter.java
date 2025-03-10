package Estructurales.Adapter;

public class TerrorAdapter implements ILibroAdapter{
    @Override
    public void getPaginas() {
        System.out.println("Numero 100 ");
    }

    @Override
    public void getISBN() {
        System.out.println("879465136");
    }
}
