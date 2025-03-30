package Estructurales.Composite;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class ItemsComposite extends BaseItem{

    public ItemsComposite(String nombre, Integer valor) {
        super(nombre, valor);
    }

    @Override
    public void add(BaseItem baseItem) {
        System.out.println("No se agrega");
    }

    @Override
    public void delete(BaseItem baseItem) {
        System.out.println("No se elimina");
    }

    @Override
    public Integer getValor() {
        return valor;
    }
}
