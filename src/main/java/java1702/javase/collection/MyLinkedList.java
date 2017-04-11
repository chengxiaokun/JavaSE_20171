package java1702.javase.collection;

/**
 * Created by mingfei.net@gmail.com
 * 4/11/17 10:28
 * https://github.com/thu/JavaSE_20171
 */
public class MyLinkedList {

    private Node first;
    private Node last;
    private int size;

    public MyLinkedList() {
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("a");
        myLinkedList.add("b");
        myLinkedList.add("c");
        System.out.println(myLinkedList.first());
        System.out.println(myLinkedList.last());
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.size());
        myLinkedList.remove(1); // [a, c]
    }

    public String remove(int index) {
        // TODO: 4/11/17
        return null;
    }
/*
   ----------[0]---[1]---[2]---[?].............[n?]
 */

    public int size() {
        return size;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("error.");
            System.exit(0);
        }
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.element;
    }

    public boolean add(String element) {
        if (first == null) {
            Node node = new Node(element, null, null);
            first = node;
            last = node;
        } else {
            Node node = new Node(element, last, null);
            last.next = node;
            last = node;
        }
        size++;
        return true;
    }

    public String first() {
        return first.element;
    }

    public String last() {
        return last.element;
    }

    private class Node { // node 节点\ [nəʊd]
        String element;
        Node prev; // prev previous 以前的\ ['priːvɪəs]
        Node next;

        public Node(String element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}
