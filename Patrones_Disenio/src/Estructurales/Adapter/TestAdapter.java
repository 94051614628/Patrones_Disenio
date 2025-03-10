package Estructurales.Adapter;

public class TestAdapter {
    public static void main(String[] args) {
        BasoAdapter basoAdapter = new BasoAdapter();

        basoAdapter.getPaginas();
        basoAdapter.getISBN();
    }
}
