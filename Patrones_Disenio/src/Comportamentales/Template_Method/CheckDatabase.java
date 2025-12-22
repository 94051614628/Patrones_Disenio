package Comportamentales.Template_Method;

public abstract  class CheckDatabase {
    public abstract void checkConnection();
    public abstract void checkSchema();
    public abstract void checkTable();
    public abstract void checkResult();

    public final void template(){
        checkConnection();
        checkSchema();
        checkTable();
        checkResult();
    }
}
