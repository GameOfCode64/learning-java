
public class Test {


    // Single Linkedlist 
    static class LL {

        private Node head;
        private Node tail;
        private Node current;

        public void addAtStart(int val) {
            Node node = new Node(val);
            node.next = head;
            head = node;
            if (tail == null) {
                tail = head;
            }
        }

        public void deleteStart() {
            if (head == null) {
                return;
            }
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
        }

        public void addAtEnd(int val) {
            Node node = new Node(val);

            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        public void display() {
            current = head;
            while (current != null) {
                System.out.print(current.val + " -> ");
                current = current.next;
            }
        }

        private class Node {

            private int val;
            private Node next;

            public Node(int val) {
                this.val = val;
            }

        }
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addAtStart(12);

        // list.deleteStart();
        System.out.println(list.tail.val);
        list.display();

    }
}
