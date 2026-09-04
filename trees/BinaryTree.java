public class BinaryTree {
    private Node root;


    public void createTree(){
        Node node = new Node(10);
        root = node;

        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
    }
    
    public void print(int val){
        System.out.println(val);
        return;
    }

    void preOrder(Node current) {
        if(current == null) {
            return;
        }
        print(current.val);
        preOrder(current.left);
        preOrder(current.right);
    }

    void InOrder(Node current) {
        if(current == null) {
            return;
        }
        InOrder(current.left);
        print(current.val);
        InOrder(current.right);
    }
    void postOrder(Node current){
         if(current == null) {
            return;
        }
        postOrder(current.left);
        postOrder(current.right);
        print(current.val);
    }

    private class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
         this.val = val;
        }
    }
}