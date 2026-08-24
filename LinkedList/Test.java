
public class Test {

    static class DLL {
        // test 

        private Node head;
        private Node tail;

        public void addAtStart(int val) {

            Node node = new Node(val);
            node.next = head;
            node.prev = null;

            if (head != null) {
                head.prev = node;
            } else {
                tail = node;
            }

            head = node;

        }

        public void addAtEnd(int val) {
            Node node = new Node(val);

            if (head == null) {
                head = node;
                tail = node;
                return;
            }
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.val + " -> ");
                current = current.next;
            }
        }

        public void displayReverse() {
            Node current = tail;
            while (current != null) {
                System.out.print(current.val + " -> ");
                current = current.prev;
            }
        }

        public void deleteAtEnd() {

            if (tail == null) {
                return;
            }

            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            tail = tail.prev;
            tail.next = null;
        }

        public void deleteAtStart() {
            if (head == null) {
                return;
            }

            if (head == tail) {
                head = null;
                tail = null;
                return;
            }

            head = head.next;
            head.prev = null;
        }

        private class Node {

            private int val;
            private Node prev;
            private Node next;

            public Node(int val) {
                this.val = val;
            }

        }
    }

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
        // LL list = new LL();
        DLL list = new DLL();
        list.addAtEnd(10);
        list.addAtEnd(12);
        list.addAtEnd(13);
        list.addAtEnd(14);
        // list.deleteAtEnd();
        list.display();
list.deleteAtStart();   
        System.out.println();
        System.out.println("Reverase");
        list.displayReverse();
        
        // System.out.println(list.tail.val);
    }
}
