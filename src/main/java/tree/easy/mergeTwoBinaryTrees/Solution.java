package tree.easy.mergeTwoBinaryTrees;

//https://leetcode.com/problems/merge-two-binary-trees/
//Leetcode: 617
import com.sun.source.tree.Tree;
import tree.TreeNode;

public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return mergeTreesHelper(t1, t2);
    }

    private TreeNode mergeTreesHelper(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;

        int sum = t1.val + t2.val;
        TreeNode newNode = new TreeNode(sum);

        TreeNode l = mergeTreesHelper(t1.left, t2.left);
        TreeNode r = mergeTreesHelper(t1.right, t2.right);

        newNode.left = l;
        newNode.right = r;

        return newNode;

    }
}
