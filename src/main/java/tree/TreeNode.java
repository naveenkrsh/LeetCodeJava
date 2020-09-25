package tree;

import com.sun.source.tree.Tree;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode Create(String input) {
        if (input.trim().isEmpty())
            return null;

        String[] arr = input.split(",");

        TreeNode root = new TreeNode(Integer.valueOf(arr[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        TreeNode current = null;

        for (int i = 1; i < arr.length; i++) {
            current = queue.poll();
            if (arr[i].equals("null"))
                continue;
            int val = Integer.valueOf(arr[i]);
            TreeNode newChild = new TreeNode(val);
            queue.add(newChild);
            queue.add(newChild);
            if (i % 2 != 0) {
                current.left = newChild;
            } else
                current.right = newChild;
        }
        return root;
    }

    @Override
    public String toString() {
        List<String> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if(current == null) {
                result.add("null");
                continue;
            }
            else
                result.add(String.valueOf(current.val));

            if(current.left != null)
                queue.add(current.left);
            else
                queue.add(null);

            if(current.right != null)
                queue.add(current.right);
            else
                queue.add(null);
        }


        int total = result.size();
        for (int i = total - 1; i >= 0; i--) {
            if (!result.get(i).equals("null"))
                break;
            result.remove(i);
        }
        return String.join(",",result);
    }
}