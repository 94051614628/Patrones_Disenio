package Comportamentales.State;

public class Failed implements DatabaseState{
    @Override
    public void next(Sentence sentence) {
        sentence.setState(new Progress());
    }

    @Override
    public String print() {
        return "Is Failed";
    }
}
