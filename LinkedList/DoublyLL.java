public class DoublyLL{

    Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if(head != null){
            head.prev = node;
        }

        head = node;

    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }

        System.out.println("END");
    }

    public void reverse(){
        Node node = head;
        Node last = null;

        while (last != null) { 
            System.out.print(last.val+ " -> ");
            last = last.prev;
        }

        System.err.println("Start");
    }

    private class  Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }        
    } 
  
}