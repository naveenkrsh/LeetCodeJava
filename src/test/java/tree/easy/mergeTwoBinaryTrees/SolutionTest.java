package tree.easy.mergeTwoBinaryTrees;

import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mergeTreesTest1() {
        TreeNode t1 = TreeNode.Create("1,3,2,5");
        TreeNode t2 = TreeNode.Create("2,1,3,null,4,null,7");

        Solution sol = new Solution();
        TreeNode result = sol.mergeTrees(t1, t2);
        assertEquals("3,4,5,5,4,null,7",result.toString());
    }

    @Test
    void mergeTreesTest2() {
        TreeNode t1 = TreeNode.Create("");
        TreeNode t2 = TreeNode.Create("2");

        Solution sol = new Solution();
        TreeNode result = sol.mergeTrees(t1, t2);
        assertEquals("2",result.toString());
    }

    @Test
    void mergeTreesTest3() {
        TreeNode t1 = TreeNode.Create("2");
        TreeNode t2 = TreeNode.Create("");

        Solution sol = new Solution();
        TreeNode result = sol.mergeTrees(t1, t2);
        assertEquals("2",result.toString());
    }
    @Test
    void mergeTreesTest4() {
        TreeNode t1 = TreeNode.Create("");
        TreeNode t2 = TreeNode.Create("");

        Solution sol = new Solution();
        TreeNode result = sol.mergeTrees(t1, t2);
        assertEquals(null,result);
    }
}