package Comportamentales.ChainResponsibility;

public class MongoOrm extends ORM{
    public MongoOrm(){

    }

    public MongoOrm(ORM next){
        super(next);
    }
    @Override
    public void connection(Database database) {
        if(database.getTypeConnection().name().equalsIgnoreCase(TypeConnection.MONGO.name())){
            System.out.println("Creando Conexion Mongo");
        }else if(hasNext()){
            getNext().connection(database);
        }else{
            System.out.println("No se encontro conexion");
        }
    }
}
