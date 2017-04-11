package java1702.javase.collection;

/**
 * Created by mingfei.net@gmail.com
 * 4/11/17 10:28
 * https://github.com/thu/JavaSE_20171
 */
public class MyLinkedList {

    public MyLinkedList() {
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("a");
    }

    public boolean add(String element) {
        // TODO: 4/11/17

        return true;
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
