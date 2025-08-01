package Estructurales.Facade.databases;

import java.util.EventListener;
import java.util.Random;

public interface RamdonConnections {
     static Boolean ExistsConnections(){
        if(Math.random() > 0.5){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }

    }
}
