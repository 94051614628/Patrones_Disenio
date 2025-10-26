package Comportamentales.Observer;

public class TestObserver {
    public static void main(String[] args) {
        var conexion1 = new SQLObserver("Hotel X");
        var conexion2 = new SQLObserver("Hospital Sanar");
        var conexion3 = new MongoObserver("Venta de respuestos");
        var conexion4 = new SQLObserver("Claro");
        var vigilant = new VigilantDatabase("Vigilante");

        vigilant.subscribe(conexion1);
        vigilant.subscribe(conexion2);
        vigilant.subscribe(conexion3);
        vigilant.subscribe(conexion4);
        vigilant.activeConexion();
        System.out.println("=======");
        vigilant.unSubcribe(conexion2);
        vigilant.activeConexion();
    }
}
