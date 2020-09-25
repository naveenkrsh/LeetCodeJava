package tree.easy.invertBinaryTree;

import tree.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root== null)
            return null;

        TreeNode l= invertTree(root.right);
        TreeNode r = invertTree(root.left);

        root.left = l;
        root.right = r;

        return root;
    }
}
