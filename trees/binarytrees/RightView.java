package trees.binarytrees;

import java.util.LinkedList;
import java.util.Queue;

public class RightView {
    public static void printRightView(TreeNode<Integer> root) {
        Queue<TreeNode<Integer>> bfs = new LinkedList<>();
        bfs.offer(root);

        while (!bfs.isEmpty()) {

            int len = bfs.size();

            for (int i = 0; i < len; i++) {
                TreeNode<Integer> node = bfs.poll();
                if (i == 0) 
                    System.out.println(node.val + " ");
                if (node.right != null)
                    bfs.offer(node.right);
                if (node.left != null)
                    bfs.offer(node.left);
            }
        }
    }

    public static void main(String [] args) {
        TreeNode<Integer> root = null;
        root = BinaryTree.createBinaryTree();
        System.out.println("Right view of the tree is: ");
        printRightView(root);
    }
}
