
import java.util.LinkedList;
import java.util.Queue;

// DFS ->

public class main {
    Queue<Node> queue = new LinkedList<>();

    public boolean searchUsingDFS(Node root, int target){
        if(root == null){
            return false;
        }

        if(root.data == target){
            return true;
        }

        boolean left = searchUsingDFS(root.left, target);
        boolean right = searchUsingDFS(root.right, target);

        return left || right;
    }

     public boolean searchUsingBFS(Node root, int target){
        if(root == null){
            return false;
        }

        queue.add(root);

        while(!queue.isEmpty()){
            Node temp = queue.poll();

            if(temp.data == target){
                return true;
            }
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        return false;
     }



    public int countNodes(Node current) {
        if(current == null){
            return 0;
        }

        int left = countNodes(current.left);
        int right = countNodes(current.right);

        return left + right + 1;
    }
    public int maxDepth(Node current) {
        if(current == null){
            return 0;
        }

        int left = maxDepth(current.left);
        int right = maxDepth(current.right);

        return Math.max(left, right) + 1;
    }
    
    public int minDepth(Node current) {
        if(current == null){
            return 0;
        }

        int left = minDepth(current.left);
        int right = minDepth(current.right);

        return Math.min(left, right) + 1;
    }

    public void levelOrder(Node current) {
        if(current == null){
            return;
        }

        queue.add(current);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.println(temp.data + "->");

            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
    }

  
    

    private class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
