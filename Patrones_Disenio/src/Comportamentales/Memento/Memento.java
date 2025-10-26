package Comportamentales.Memento;

public class Memento {
    private String instruction;
    private String database;

    public Memento(InstructionSql instructionSql){
        this.instruction = instructionSql.getInstruction();
        this.database =instructionSql.getDatabase();
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }
}
