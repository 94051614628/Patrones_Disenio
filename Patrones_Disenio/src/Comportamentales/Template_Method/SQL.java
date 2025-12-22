package Comportamentales.Template_Method;

public class SQL extends CheckDatabase{
    @Override
    public void checkConnection() {
        System.out.println("Check conexion...."+this.getClass().getName());
    }

    @Override
    public void checkSchema() {
        System.out.println("Check Schema...."+this.getClass().getName());
    }

    @Override
    public void checkTable() {
        System.out.println("Check Table...."+this.getClass().getName());
    }

    @Override
    public void checkResult() {
        System.out.println("Check Resul OK...."+this.getClass().getName());
    }
}
