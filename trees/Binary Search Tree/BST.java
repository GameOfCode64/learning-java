
public class BST {

    private Node root;

    Node current = root;

    public void insert(int val){
        Node node = new Node(val);
        if(root == null){
            root = node;
            return;
        }
        Node current = root;
        while (val != current.val) {
            if(val > current.val){
                if(current.right == null){
                    current.right = node;
                    return;
                }
                current = current.right;
            }else{
                if(current.left == null){
                    current.left = node;
                    return;
                }
                current = current.left;
            }
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
