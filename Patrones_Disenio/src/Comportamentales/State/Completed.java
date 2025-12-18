package Comportamentales.State;

public class Completed implements DatabaseState{
    @Override
    public void next(Sentence sentence) {
        System.out.println("Has completado la sentencia");
    }

    @Override
    public String print() {
        return "Is Complete";
    }
}
