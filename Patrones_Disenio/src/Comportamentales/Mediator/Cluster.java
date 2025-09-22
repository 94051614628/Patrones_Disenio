package Comportamentales.Mediator;

public class Cluster implements Action{
    private String name;
    private Integer number;
    private Mediator mediator;

    public Cluster(String name,Integer number,Mediator mediator){
        this.name= name;
        this.number = number;
        this.mediator = mediator;
        this.mediator.add(this);
    }

    @Override
    public void send() {
        System.out.println("Enviando mensaje desde: "+ name);
        mediator.send(this);
    }

    @Override
    public void receive(Action action) {
        System.out.println("Recibiendo mensaje desde: "+ ((Cluster) action).name+ " a Cluster :"+this.name+":"+this.number);
    }
}
