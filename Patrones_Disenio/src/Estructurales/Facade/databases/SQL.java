package Estructurales.Facade.databases;



public class SQL implements Sentences {
    @Override
    public void createConnection() {
        System.out.println("Coneccion SQL Creada");
    }

    @Override
    public void createTable() {
        System.out.println("Tabla creada en el SQL");
    }

    @Override
    public void createSelect() {
        System.out.println("Se realiza la seleecion de los datos en el SQL ");
    }

    @Override
    public void deleteTable() {
        System.out.println("Tabla Eliminada en SQL");
    }
}
