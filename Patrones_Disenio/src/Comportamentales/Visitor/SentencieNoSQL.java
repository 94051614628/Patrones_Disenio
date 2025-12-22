package Comportamentales.Visitor;

public class SentencieNoSQL implements Vistable {
    private String sentencie;

    public SentencieNoSQL(String sentencie) {
        this.sentencie = sentencie;
    }
    public String getSentencie() {
        return sentencie;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
