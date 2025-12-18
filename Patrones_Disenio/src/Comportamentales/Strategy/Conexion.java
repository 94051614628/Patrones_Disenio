package Comportamentales.Strategy;

public class Conexion {
    private ConexionStrategy conexionStrategy;

    public void makeConnection(Sentence sentence){
        conexionStrategy.getConnection(sentence);
        System.out.println("Total Calls: "+sentence.getCall());
    }

    public ConexionStrategy getConexionStrategy() {
        return conexionStrategy;
    }

    public void setConexionStrategy(ConexionStrategy conexionStrategy) {
        this.conexionStrategy = conexionStrategy;
    }
}
