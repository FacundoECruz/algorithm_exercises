import utils.TreeNode;

public class Exercise11 {

    boolean isBalancedTree = true;

    public boolean isBalanced(TreeNode root) {
        checkNode(root);
        return isBalancedTree;
    }

    private int checkNode(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = checkNode(root.left);
        int right = checkNode(root.right);

        if(Math.abs(left - right) > 1){
            isBalancedTree = false;
        }

        return Math.max(left, right) + 1;
    }
}
