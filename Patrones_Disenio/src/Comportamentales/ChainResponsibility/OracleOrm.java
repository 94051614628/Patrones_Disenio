package Comportamentales.ChainResponsibility;

public class OracleOrm extends ORM{
    public OracleOrm(){

    }

    public OracleOrm(ORM next){
        super(next);
    }

    @Override
    public void connection(Database database) {
        if(database.getTypeConnection().name().equalsIgnoreCase(TypeConnection.ORACLE.name())){
            System.out.println("Creando Conexion Oracle");
        }else if(hasNext()){
            getNext().connection(database);
        }else{
            System.out.println("No se encontro conexion");
        }
    }
}
