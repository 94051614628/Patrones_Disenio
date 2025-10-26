package Comportamentales.Observer;

public class SQLObserver extends ManagerDatabase implements MyObserver{
    private static final String TYPE = "SQL";

    public SQLObserver(String nameDatabase){
        super(nameDatabase);
        setTypeDatabase(TYPE);

    }

    @Override
    public void activeConexion() {
        System.out.println(getNameDatabase()+" Activando conexion "+getTypeDatabase());
    }

    @Override
    public void update() {
        activeConexion();
    }
}
