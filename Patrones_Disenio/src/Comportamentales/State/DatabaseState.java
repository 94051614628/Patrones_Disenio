package Comportamentales.State;

public interface DatabaseState {
    void  next(Sentence sentence);
    String print();
}
