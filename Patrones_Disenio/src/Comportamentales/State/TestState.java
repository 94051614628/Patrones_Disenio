package Comportamentales.State;

public class TestState {
    public static void main(String[] args) {
        var setence = new Sentence("Select");
        System.out.println(setence.toString());
        setence.next();
        System.out.println(setence.toString());
        setence.next();
        System.out.println(setence.toString());
        setence.next();
        System.out.println(setence.toString());
        setence.next();
        System.out.println(setence.toString());
    }
}
