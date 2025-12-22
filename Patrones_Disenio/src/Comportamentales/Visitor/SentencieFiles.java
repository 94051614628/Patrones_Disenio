package Comportamentales.Visitor;

public class SentencieFiles implements Vistable{
    private String sentencie;

    public SentencieFiles(String sentencie) {
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
