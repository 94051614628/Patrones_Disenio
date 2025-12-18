package Comportamentales.State;

public class Blocked implements DatabaseState{
    @Override
    public void next(Sentence sentence) {
        sentence.setState(new UnBlocked());
    }

    @Override
    public String print() {
        return "In Blocked";
    }
}
