package Comportamentales.ChainResponsibility;

public abstract  class ORM {
    protected ORM next;

    public ORM() {
    }

    public ORM(ORM next) {
        this.next = next;
    }

    public ORM getNext() {
        return next;
    }

    public void setNext(ORM next) {
        this.next = next;
    }

    public Boolean hasNext(){
        return getNext() != null;
    }

    public abstract void connection(Database database);
}
