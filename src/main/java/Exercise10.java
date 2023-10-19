import utils.TreeNode;

public class Exercise10 {
    private int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        updateResult(root);
        return result;
    }

    private int updateResult(TreeNode root) {
        if (root == null)
            return -1;
        int left = updateResult(root.left);
        int right = updateResult(root.right);
        result = Math.max(result, left+right+2);
        return Math.max(left, right) + 1;
    }
}
