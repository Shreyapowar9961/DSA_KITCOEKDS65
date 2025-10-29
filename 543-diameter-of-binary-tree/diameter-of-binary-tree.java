class Solution {
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;

        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);

        // Update diameter if left + right path is larger
        diameter = Math.max(diameter, leftDepth + rightDepth);

        // Return the height of the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
