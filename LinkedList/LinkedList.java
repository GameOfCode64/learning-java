
public class LinkedList {

    private int size;
    private Node head;
    private Node tail;

    public LinkedList() {
        this.size = 0;
    }



    public void insertFirst(int val) {
        Node n = new Node(val);
        n.next = head;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    class Node {

        int data;
        Node next;

        public Node(int val) {
            this.data = val;
        }

        public Node(int val, Node next) {
            this.data = val;
            this.next = next;
        }
    }

}
