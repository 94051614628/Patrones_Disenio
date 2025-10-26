package Comportamentales.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class VigilantDatabase extends ManagerDatabase implements MyObservable{
    private List<MyObserver> observers = new ArrayList<>();

    public VigilantDatabase(String nameDatabase){
        super(nameDatabase);
    }

    @Override
    public void activeConexion() {
        System.out.println("Enviado activar las conexiones");
        broadcast();
    }

    @Override
    public void subscribe(MyObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void unSubcribe(MyObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void broadcast() {
        this.observers.forEach(MyObserver::update);
    }


}
