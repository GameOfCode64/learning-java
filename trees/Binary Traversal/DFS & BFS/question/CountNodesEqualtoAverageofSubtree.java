/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int matchingNodesCount = 0;
    public int averageOfSubtree(TreeNode root) {
        matchingNodesCount = 0; 
        dfs(root);
        return matchingNodesCount;        
    }

    private int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }

        int[] leftResult = dfs(root.left);
        int[] rightResult = dfs(root.right);

        int currentSum = root.val + leftResult[0] + rightResult[0];
        int currentCount = 1 + leftResult[1] + rightResult[1];

        if (root.val == (currentSum / currentCount)) {
            matchingNodesCount++;
        }

        return new int[]{currentSum, currentCount};
    }

}