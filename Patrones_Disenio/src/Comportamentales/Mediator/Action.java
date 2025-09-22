package Comportamentales.Mediator;

public interface Action {
    void send();
    void receive(Action action);
}
