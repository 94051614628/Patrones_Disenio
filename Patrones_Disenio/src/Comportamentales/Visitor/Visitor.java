package Comportamentales.Visitor;

public interface Visitor {
    void visit(SentencieFiles sentencieFiles);
    void visit(SentencieSQL sentencieSQL);
    void visit(SentencieNoSQL sentencieNoSQL);
}
