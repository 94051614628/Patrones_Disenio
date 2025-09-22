package Comportamentales.ChainResponsibility;

public class TestChain {
    public static void main(String[] args) {
        var database = new Database(TypeConnection.SQL);

        var connection = new Connection(new SQLOrm(new MongoOrm(new OracleOrm())));

        connection.chainConnection(database);
    }
}
