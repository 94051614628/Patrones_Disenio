package Comportamentales.Memento;

public class TestMemento {
    public static void main(String[] args) {
        InstructionSql instructionSql = new InstructionSql("Select","SQL","Revisar");
        System.out.println("Save 1"+instructionSql);
        instructionSql.save();
        instructionSql = new InstructionSql("Update","SQL","Revisar");
        System.out.println("Save 2"+instructionSql);
        instructionSql.save();

        System.out.println("-----back----");
        instructionSql.back();
        System.out.println("Save 2"+instructionSql);

        System.out.println("-----Redu----");
        instructionSql.forward();
        System.out.println("Save 2"+instructionSql);


    }
}
