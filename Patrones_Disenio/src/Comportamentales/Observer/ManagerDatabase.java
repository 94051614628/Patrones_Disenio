package Comportamentales.Observer;

public abstract class ManagerDatabase {
    private String typeDatabase;
    private String nameDatabase;

    public ManagerDatabase(String nameDatabase) {
        this.nameDatabase = nameDatabase;
    }

    public String getTypeDatabase() {
        return typeDatabase;
    }

    public void setTypeDatabase(String typeDatabase) {
        this.typeDatabase = typeDatabase;
    }

    public String getNameDatabase() {
        return nameDatabase;
    }

    public void setNameDatabase(String nameDatabase) {
        this.nameDatabase = nameDatabase;
    }

    public abstract void activeConexion();
}
