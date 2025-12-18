package Comportamentales.Strategy;

public class SqlConnectionStrategy implements  ConexionStrategy{
    @Override
    public void getConnection(Sentence sentence) {
        System.out.println("...Conexion SQL...");
        System.out.println("...Ejctado...");
        sentence.setCall(sentence.getCall()+1);
    }
}
