package Comportamentales.Mediator;

public class TestMediator {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Cluster cluster0 = new Cluster("Amazonas",1,mediator);
        Cluster cluster1 = new Cluster("Antioquia",2,mediator);
        Cluster cluster2 = new Cluster("Bolivar",3,mediator);
        Cluster cluster4 = new Cluster("Cordoba",4,mediator);

        cluster0.send();
    }
}
