package tree.easy.maxiumDepthOfBinaryTree;

import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxDepthTestEmpty() {
        TreeNode root = TreeNode.Create("");
        Solution sol = new Solution();
        int result = sol.maxDepth(root);

        assertEquals(0,result);
    }

    @Test
    void maxDepthTestOne() {
        TreeNode root = TreeNode.Create("1");
        Solution sol = new Solution();
        int result = sol.maxDepth(root);

        assertEquals(1,result);
    }

    @Test
    void maxDepthTestTwo1() {
        TreeNode root = TreeNode.Create("1,2");
        Solution sol = new Solution();
        int result = sol.maxDepth(root);

        assertEquals(2,result);
    }

    @Test
    void maxDepthTestTwo2() {
        TreeNode root = TreeNode.Create("1,null,2");
        Solution sol = new Solution();
        int result = sol.maxDepth(root);

        assertEquals(2,result);
    }

    @Test
    void maxDepthTest1() {
        TreeNode root = TreeNode.Create("3,9,20,null,null,15,7");
        Solution sol = new Solution();
        int result = sol.maxDepth(root);

        assertEquals(3,result);
    }
}