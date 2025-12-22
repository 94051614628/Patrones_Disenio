package Comportamentales.Visitor;

public class SentencieSQL implements Vistable {
    private String sentencie;

    public SentencieSQL(String sentencie) {
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
