package trees.binarytrees;

import java.util.LinkedList;
import java.util.Queue;

public class LeftView {
    public static void printLeftView(TreeNode<Integer> root) {
        Queue<TreeNode<Integer>> bfs = new LinkedList<>();
        bfs.offer(root);

        while (!bfs.isEmpty()) {

            int len = bfs.size();

            for (int i = 0; i < len; i++) {
                TreeNode<Integer> node = bfs.poll();
                if (i == 0) 
                    System.out.println(node.val + " ");
                if (node.left != null)
                    bfs.offer(node.left);
                if (node.right != null)
                    bfs.offer(node.left);
            }
        }
    }

    public static void main(String [] args) {
        TreeNode<Integer> root = null;
        root = BinaryTree.createBinaryTree();
        System.out.println("Left view of the tree is: ");
        printLeftView(root);
    }
}
