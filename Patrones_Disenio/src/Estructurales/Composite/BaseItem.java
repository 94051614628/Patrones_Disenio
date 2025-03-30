package Estructurales.Composite;

import java.util.List;

public abstract class BaseItem {
    protected String nombre;
    protected Integer valor;
    protected List<BaseItem> items;

    public BaseItem(String nombre, Integer valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public abstract  void add(BaseItem baseItem);
    public abstract void delete(BaseItem baseItem);
    public abstract Integer getValor();

}
