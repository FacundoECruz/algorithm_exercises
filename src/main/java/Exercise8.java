import utils.TreeNode;

public class Exercise8 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }

        TreeNode left = invertTree(root.left);
        TreeNode rigth = invertTree(root.right);

        root.left = rigth;
        root.right = left;

        return root;
    }
}
