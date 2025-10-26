package Comportamentales.Observer;

public interface MyObservable {
    void subscribe(MyObserver observer);
    void unSubcribe(MyObserver observer);
    void broadcast();
}
