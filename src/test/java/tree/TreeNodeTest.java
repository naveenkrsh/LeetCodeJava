package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {

    @Test
    void createTestEmpty() {
        String input = "";
        TreeNode root = TreeNode.Create(input);
        assertEquals(null,root);
    }
    @Test
    void createTest1() {
        String input = "1,3,2,5";
        TreeNode root = TreeNode.Create(input);
        assertEquals(1, root.val);
        assertEquals(3, root.left.val);
        assertEquals(2, root.right.val);
        assertEquals(5, root.left.left.val);
        assertEquals(input,root.toString());
    }

    @Test
    void createTest2() {
        String input = "2,1,3,null,4,null,7";
        TreeNode root = TreeNode.Create(input);
        assertEquals(2, root.val);
        assertEquals(1, root.left.val);
        assertEquals(3, root.right.val);
        assertEquals(4, root.left.right.val);
        assertEquals(7, root.right.right.val);
        assertEquals(input,root.toString());
    }
}