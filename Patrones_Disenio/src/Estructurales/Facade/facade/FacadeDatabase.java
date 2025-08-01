package Estructurales.Facade.facade;

import Estructurales.Facade.databases.Mongo;
import Estructurales.Facade.databases.RamdonConnections;
import Estructurales.Facade.databases.SQL;
import Estructurales.Facade.databases.Sentences;

public class FacadeDatabase {

    /**
     * El facade se encarga de encapsular toda la logica en el sin que las demas clases conozcan
     * lo qu tiene por dentro.
     * **/
    public static void work(String type){
        var conecction = RamdonConnections.ExistsConnections();
        Sentences sentences;
        if(type.equalsIgnoreCase("Relacional")){
            sentences = new SQL();
        }else {
            sentences = new Mongo();
        }

        if (conecction){
            sentences.createConnection();
        }else{
            System.out.println("Conexion existe");
        }

        sentences.createTable();
        sentences.createSelect();
        sentences.deleteTable();
    }
}
