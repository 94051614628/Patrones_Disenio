package Comportamentales.Strategy;

public class NoSqlConnectionStrategy implements ConexionStrategy{
    @Override
    public void getConnection(Sentence sentence) {
        System.out.println("...Conexion No SQL...");
        System.out.println("...Ejctado...");
        sentence.setCall(sentence.getCall()+1);
    }
}
