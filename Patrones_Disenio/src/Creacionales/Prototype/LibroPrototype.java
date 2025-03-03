package Creacionales.Prototype;

/*
* En el prototype se crean dos cnotructores
* */
public abstract class LibroPrototype {
    protected String tipo;
    protected String escritor;

    // 1. Con el fin de crear objetos
    public LibroPrototype(String tipo, String escritor) {
        this.tipo = tipo;
        this.escritor = escritor;
    }

    // 2. Para que el clon pueda trabajar
    public LibroPrototype(LibroPrototype libro) {
        if(libro !=null){
            setTipo(libro.tipo);
            setEscritor(libro.escritor);
        }
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public abstract LibroPrototype clone();
}
