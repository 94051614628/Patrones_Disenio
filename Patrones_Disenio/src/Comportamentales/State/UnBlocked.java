package Comportamentales.State;

public class UnBlocked implements DatabaseState{
    @Override
    public void next(Sentence sentence) {
        sentence.setState(new Progress());
    }

    @Override
    public String print() {
        return "In UnBlocked";
    }
}
