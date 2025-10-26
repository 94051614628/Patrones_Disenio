package Comportamentales.Observer;

public class MongoObserver extends ManagerDatabase implements MyObserver{
    private static final String TYPE = "NO-SQL";

    public MongoObserver(String nameDatabase){
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
