package Estructurales.Adapter;

public class BasoAdapter implements ILibroAdapter{

    private Baso baso;
    // Clase que la Adapta.
    public BasoAdapter(){
        baso = new Baso();
    }

    @Override
    public void getPaginas() {
        baso.getMaterial();
    }

    @Override
    public void getISBN() {
        baso.getId();
    }
}
