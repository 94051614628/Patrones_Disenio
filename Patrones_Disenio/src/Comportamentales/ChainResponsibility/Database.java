package Comportamentales.ChainResponsibility;

public class Database {
    private TypeConnection typeConnection;

    public Database(TypeConnection typeConnection) {
        this.typeConnection = typeConnection;
    }

    public TypeConnection getTypeConnection() {
        return typeConnection;
    }

    public void setTypeConnection(TypeConnection typeConnection) {
        this.typeConnection = typeConnection;
    }
}
