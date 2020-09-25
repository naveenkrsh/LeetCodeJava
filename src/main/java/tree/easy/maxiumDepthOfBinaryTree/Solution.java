package tree.easy.maxiumDepthOfBinaryTree;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/
//Leetcode 104

import tree.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        return Math.max(l,r)+1;
    }
}
