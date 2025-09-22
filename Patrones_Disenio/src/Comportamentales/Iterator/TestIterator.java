package Comportamentales.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        ListNode<String> nodes = new ListNode(new Node("Hola"));
        nodes.addEnd("Como");
        nodes.addEnd("vas");

        while(nodes.hasNext()){
            System.out.println(nodes.next());
        }
    }
}
