package Creacionales.Builder;

public class TestBuilder {
    public static void main(String[] args) {
        Libro libro = Libro.builder()
                .anio("1995")
                .ascritor("Jorge Gomez")
                .pais("Colombia")
                .build();

        System.out.println(libro.toString());
    }
}
