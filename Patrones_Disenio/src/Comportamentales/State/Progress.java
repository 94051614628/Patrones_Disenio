package Comportamentales.State;

public class Progress implements DatabaseState{
    @Override
    public void next(Sentence sentence) {
        if (Math.random() < 0.5){
            sentence.setState(new Failed());
        }else{
            sentence.setState(new Completed());
        }
    }

    @Override
    public String print() {
        return "Is in Progress";
    }
}
