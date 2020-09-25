package tree.easy.invertBinaryTree;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void invertTreeTestOne() {
        TreeNode root = TreeNode.Create("4");

        Solution  sol = new Solution();
        TreeNode result = sol.invertTree(root);

        String invertedTree = "4";
        assertEquals(invertedTree,result.toString());

    }
    @Test
    void invertTreeTestTwo1() {
        TreeNode root = TreeNode.Create("4,2");

        Solution  sol = new Solution();
        TreeNode result = sol.invertTree(root);

        String invertedTree = "4,null,2";
        assertEquals(invertedTree,result.toString());

    }

    @Test
    void invertTreeTestTwo2() {
        TreeNode root = TreeNode.Create("4,null,2");

        Solution  sol = new Solution();
        TreeNode result = sol.invertTree(root);

        String invertedTree = "4,2";
        assertEquals(invertedTree,result.toString());

    }

    @Test
    void invertTreeTest1() {
        TreeNode root = TreeNode.Create("4,2,7,1,3,6,9");

        Solution  sol = new Solution();
        TreeNode result = sol.invertTree(root);

        String invertedTree = "4,7,2,9,6,3,1";
        assertEquals(invertedTree,result.toString());

    }
}