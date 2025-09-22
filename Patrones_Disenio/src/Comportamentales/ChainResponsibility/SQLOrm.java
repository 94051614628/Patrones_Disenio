package Comportamentales.ChainResponsibility;

public class SQLOrm extends ORM{

    public SQLOrm(){

    }

    public SQLOrm(ORM next){
        super(next);
    }


    @Override
    public void connection(Database database) {
        if(database.getTypeConnection().name().equalsIgnoreCase(TypeConnection.SQL.name())){
            System.out.println("Creando Conexion SQL");
        }else if(hasNext()){
            getNext().connection(database);
        }else{
            System.out.println("No se encontro conexion");
        }
    }
}
