package Comportamentales.Visitor;

public class TestVisitor {
    public static void main(String[] args) {
        Visitor visitor = new ConnectionVisitor();
        SentencieSQL sentencieSQL = new SentencieSQL("Select");
        sentencieSQL.accept(visitor);
        SentencieFiles sentencieFile = new SentencieFiles("Update");
        sentencieFile.accept(visitor);
        SentencieNoSQL sentencieNoSQL = new SentencieNoSQL("Delete");
        sentencieNoSQL.accept(visitor);
    }
}
