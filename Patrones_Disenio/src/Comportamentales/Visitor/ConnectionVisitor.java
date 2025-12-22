package Comportamentales.Visitor;

public class ConnectionVisitor implements Visitor {
    @Override
    public void visit(SentencieFiles sentencieFiles) {
        System.out.println("...Ejecutando conexion de File...");
        System.out.println(sentencieFiles.getSentencie());
    }

    @Override
    public void visit(SentencieSQL sentencieSQL) {
        System.out.println("...Ejecutando conexion de Sql...");
        System.out.println(sentencieSQL.getSentencie());
    }

    @Override
    public void visit(SentencieNoSQL sentencieNoSQL) {
        System.out.println("...Ejecutando conexion de No Sql...");
        System.out.println(sentencieNoSQL.getSentencie());
    }
}
