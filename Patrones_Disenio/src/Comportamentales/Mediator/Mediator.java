package Comportamentales.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
   private  List<Action> actions = new ArrayList<>();

   public void add(Action action){
       actions.add(action);
   }

   public void send(Action action){
       actions.forEach(d->{
           if(d != action){
               d.receive(action);
           }
       });
   }

}
