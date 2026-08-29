public class StackUsingLinkedList{
    private Node top;

    public void push(int val) {
        Node node = new Node(val);
        node.next = top;        
        top = node;
    }

    public int pop() {
        if(top == null){
            return -1;
        }
        int val = top.val;
        top = top.next;
        return val;
    }

    public int peek() {
        if(top == null){
            return -1;
        }
        return top.val;
    }

    public boolean  isEmpty(){
        return top == null;
    }

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
}