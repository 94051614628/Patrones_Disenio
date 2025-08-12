package Estructurales.Proxy.information;

public interface FileDatabase {
    void write(String name);
    InformationDatabase load(String name);
}
