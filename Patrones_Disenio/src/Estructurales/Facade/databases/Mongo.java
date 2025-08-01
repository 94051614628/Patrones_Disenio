package Estructurales.Facade.databases;

public class Mongo implements Sentences{
    @Override
    public void createConnection() {
        System.out.println("Coneccion Mongo Creada");
    }

    @Override
    public void createTable() {
        System.out.println("Tabla creada en el Mongo");
    }

    @Override
    public void createSelect() {
        System.out.println("Se realiza la seleecion de los datos en el Mongo ");
    }

    @Override
    public void deleteTable() {
        System.out.println("Tabla Eliminada en Mongo");
    }
}
