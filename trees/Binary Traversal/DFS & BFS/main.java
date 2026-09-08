
import java.util.LinkedList;
import java.util.Queue;

// DFS ->

public class main {
    Queue<Node> queue = new LinkedList<>();


    public int maxDepth(Node current) {
        if(current == null){
            return 0;
        }

        int left = maxDepth(current.left);
        int right = maxDepth(current.right);

        return Math.max(left, right) + 1;
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
