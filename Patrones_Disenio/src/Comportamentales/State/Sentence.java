package Comportamentales.State;


public class Sentence {
    private String typeSentence;
    private DatabaseState state;

    public Sentence(String typeSentence) {
        this.typeSentence = typeSentence;
        this.state = new Blocked();
    }

    public String getTypeSentence() {
        return typeSentence;
    }

    public void setTypeSentence(String typeSentence) {
        this.typeSentence = typeSentence;
    }

    public DatabaseState getState() {
        return state;
    }

    public void setState(DatabaseState state) {
        this.state = state;
    }

    public void next(){
        state.next(this);
    }

    @Override
    public String toString() {
        return typeSentence + state.print();
    }
}
