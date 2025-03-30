package Estructurales.Composite;

public class TestComposite {
    public static void main(String[] args) {

        BolsaComposite bolsa1 = new BolsaComposite("Bolsa 1");
        BolsaComposite bolsa2 = new BolsaComposite("Bolsa 2");
        BolsaComposite bolsa3 = new BolsaComposite("Bolsa 3");

        bolsa2.add(new ItemsComposite("Cuentos 1",2));
        bolsa2.add(new ItemsComposite("Libro #2 ",3));
        var libro7 = new ItemsComposite("Libro #7 ",8);
        bolsa2.add(libro7);
        bolsa2.delete(libro7);
        var lonchera = new ItemsComposite("Lonchera",15);
        bolsa3.add(lonchera);

        bolsa1.add(bolsa2);
        bolsa1.add(bolsa3);

        System.out.println("Suma Total: ".concat(bolsa1.getValor().toString()));

    }
}
