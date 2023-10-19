import utils.TreeNode;

public class Exercise12 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        boolean leftSubTreeEqual = isSameTree(p.left, q.left);
        boolean rightSubTreeEqual = isSameTree(p.right, q.right);
        return leftSubTreeEqual && rightSubTreeEqual;
    }
}
