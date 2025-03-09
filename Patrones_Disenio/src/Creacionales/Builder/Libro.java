package Creacionales.Builder;

public class Libro {
    private String tipo;
    private String escritor;
    private String anio;
    private String pais;

    private Libro(LibroBuilder libro){
        setPais(libro.pais);
        setTipo(libro.tipo);
        setEscritor(libro.escritor);
        setAnio(libro.anio);
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "tipo='" + tipo + '\'' +
                ", escritor='" + escritor + '\'' +
                ", anio='" + anio + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

    public static LibroBuilder builder(){
        return new LibroBuilder();
    }

    public static class LibroBuilder{
        private String tipo;
        private String escritor;
        private String anio;
        private String pais;

        public LibroBuilder tipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public LibroBuilder ascritor(String escritor) {
            this.escritor = escritor;
            return this;
        }

        public LibroBuilder anio(String anio) {
            this.anio = anio;
            return this;
        }

        public LibroBuilder pais(String pais) {
            this.pais = pais;
            return this;
        }

        public Libro build(){
            return new Libro(this);
        }
    }
}
