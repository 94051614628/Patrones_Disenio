package Comportamentales.Strategy;

public class TestStrategy {
    public static void main(String[] args) {
        var sentence = new Sentence("Select");
        var conection = new Conexion();
        conection.setConexionStrategy(new SqlConnectionStrategy());
        conection.makeConnection(sentence);
        conection.setConexionStrategy(new NoSqlConnectionStrategy());
        conection.makeConnection(sentence);
        conection.setConexionStrategy(new SqlConnectionStrategy());
        conection.makeConnection(sentence);

    }
}
