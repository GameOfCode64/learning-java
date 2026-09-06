
import java.util.LinkedList;
import java.util.Queue;

// DFS ->

public class dfs {
    Queue<Node> queue = new LinkedList<>();
    Queue<Node> queue1 = new LinkedList<>();
    Queue<Node> queue2 = new LinkedList<>();


    public void levelOrder() {
        if (queue.isEmpty()) {
            return;
        }

        Node currentNode = queue.poll();
        System.out.print(currentNode.data + " ");

        if (currentNode.left != null) {
            queue.add(currentNode.left);
        }
        if (currentNode.right != null) {
            queue.add(currentNode.right);
        }

        levelOrder();
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
