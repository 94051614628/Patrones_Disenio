package Comportamentales.Iterator;

import java.util.Iterator;

public class ListNode<T> implements Iterator<Node<T>> {
    private Node<T> head, tail;
    private Integer size, position;


    public ListNode() {
        size = position = 0;
    }

    public ListNode(Node<T> node) {
        this.head= node;
        this.tail = node;
        position = 0;
        size=1;
    }

    public Boolean isEmpty(){
        return size == 0;
    }

    private void addEmpty(T value){
        Node<T> node = new Node<>(value);
        this.head = node;
        this.tail = node;
        size = 1;
    }

    public void addEnd(T value){
        if(isEmpty()){
            addEmpty(value);
            return;
        }
        Node node = new Node<>(value);
        tail.setNext(node);
        tail = node;
        size++;
    }

    private Node<T> get(Integer pos){
        if(pos > size || pos < 0 || isEmpty()){
            return null;
        }
        Integer conut = 0;
        Node<T> node = head;
        while (conut < pos){
            node =node.getNext();
            conut++;
        }
        return node;
    }


    @Override
    public boolean hasNext() {
       if (position < size)
           return true;
       return false;
    }

    @Override
    public Node<T> next() {
        Node<T> next = get(position);
        position++;
        return next;
    }
}
