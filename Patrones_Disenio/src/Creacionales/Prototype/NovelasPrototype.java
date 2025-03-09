package Creacionales.Prototype;

public class NovelasPrototype extends LibroPrototype{
    private String contenido;

    // 1. Con el fin de crear objetos
    public NovelasPrototype(String tipo, String escritor, String contenido) {
        super(tipo, escritor);
        this.contenido = contenido;
    }



    // 2. Para que el clon pueda trabajar
    public NovelasPrototype(NovelasPrototype novelasPrototype) {
        super(novelasPrototype);

        if(novelasPrototype != null)
            this.contenido = novelasPrototype.contenido;
    }

    @Override
    public LibroPrototype clone() {
        return new NovelasPrototype(this);
    }

    @Override
    public String toString() {
        return "NovelasPrototype{" +
                "contenido='" + contenido + '\'' +
                ", tipo='" + tipo + '\'' +
                ", escritor='" + escritor + '\'' +
                '}';
    }
}
