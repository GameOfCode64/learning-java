
public class BST {

    private Node root;

    Node Current = root;

    public void insert(int val){
        Node node = new Node(val);
        if(Current == null){
            root = node;
            return;
        }
        if(val > Current.val){    
            Current.right = node;
        }else{
            Current.left = node;
        }
    }

    private class Node {

        int val;
        Node left;
        Node right;

        Node(int data) {
            this.val = data;
        }
    }
}
