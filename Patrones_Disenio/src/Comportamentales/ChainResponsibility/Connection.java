package Comportamentales.ChainResponsibility;

public class Connection {
    private ORM orm;

    public Connection(ORM orm) {
        this.orm = orm;
    }

    public ORM getOrm() {
        return orm;
    }

    public void setOrm(ORM orm) {
        this.orm = orm;
    }

    public void chainConnection(Database database){
        System.out.println("Creando Conexion de ".concat(database.getTypeConnection().name()));
        orm.connection(database);
    }

}
