package Estructurales.Composite;

import java.util.ArrayList;
import java.util.stream.Stream;

public class BolsaComposite extends BaseItem{
    public BolsaComposite(String nombre) {
        super(nombre, 0);
        items = new ArrayList<>();
    }

    @Override
    public void add(BaseItem baseItem) {
        items.add(baseItem);
    }

    @Override
    public void delete(BaseItem baseItem) {
        items.remove(baseItem);
    }

    @Override
    public Integer getValor() {

        return items.stream()
                .map(item->{
                    return item.getValor();
                })
                .reduce(0,(a,b)-> a+b)
                .intValue();
    }
}
