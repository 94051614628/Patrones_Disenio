package Comportamentales.Memento;

public class InstructionSql {
    private String description;
    private String instruction;
    private String database;
    private static MementoManager memento = new MementoManager();

    public InstructionSql(String instruction, String database,String description) {
        this.instruction = instruction;
        this.database = database;
        this.description = description;
    }

    public InstructionSql(String description){
        this.description = description;
    }

    public void save(){
        //Crear
        memento.save(new Memento(this));
    }

    public void back(){
        //Deshacer
        Memento memento1 = memento.undo();
        setDatabase(memento1.getDatabase());
        setInstruction(memento1.getInstruction());
    }

    public void  forward(){
        //Rehacer
        Memento memento1 = memento.redo();
        setDatabase(memento1.getDatabase());
        setInstruction(memento1.getInstruction());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    public String toString() {
        return "InstructionSql{" +
                "description='" + description + '\'' +
                ", instruction='" + instruction + '\'' +
                ", database='" + database + '\'' +
                '}';
    }
}
