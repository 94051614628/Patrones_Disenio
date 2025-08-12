package Estructurales.Proxy.information;

import java.io.Serializable;

public class InformationDatabase implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String type;
    private Integer numberConnection;
    private Integer numberSelect;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumberConnection() {
        return numberConnection;
    }

    public void setNumberConnection(Integer numberConnection) {
        this.numberConnection = numberConnection;
    }

    public Integer getNumberSelect() {
        return numberSelect;
    }

    public void setNumberSelect(Integer numberSelect) {
        this.numberSelect = numberSelect;
    }

    @Override
    public String toString() {
        return "InformationDatabase{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", numberConnection=" + numberConnection +
                ", numberSelect=" + numberSelect +
                '}';
    }
}
