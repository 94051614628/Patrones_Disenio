package Comportamentales.Memento;

import java.util.ArrayList;
import java.util.List;

public class MementoManager {
    private List<Memento> mementos = new ArrayList<>();
    private Integer index;

    public MementoManager() {
        this.index =0;
    }

    public void save(Memento memento){
        mementos.add(memento);
    }

    public Memento undo(){
        if(mementos.isEmpty() || mementos.size() == index)
            throw new IndexOutOfBoundsException("No Index");
        Memento memento = mementos.get(index);
        index++;
        return memento;

    }

    public Memento redo(){
        if(mementos.isEmpty() || index ==0)
            throw new IndexOutOfBoundsException("No Index");
        Memento memento = mementos.get(index);
        index--;
        return memento;
    }
}
