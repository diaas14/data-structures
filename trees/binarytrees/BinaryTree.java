package trees.binarytrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    
    public static TreeNode<Integer> insert(TreeNode<Integer> root, int val) {
        if (root == null) 
            return new TreeNode<Integer>(val);
        Queue <TreeNode<Integer>> bfs = new LinkedList<>();
        bfs.offer(root);

        while(!bfs.isEmpty()) {
            TreeNode<Integer> node = bfs.poll();
            if (node.left == null) {
                node.left = new TreeNode<Integer>(val);
                return root;
            } else {
                bfs.offer(node.left);
            }

            if (node.right == null) {
                node.right = new TreeNode<Integer>(val);
                return root;
            } else {
                bfs.offer(node.right);
            }
        }
        return root;
    }

    public static TreeNode<Integer> createBinaryTree() {
        TreeNode<Integer> root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values in level order, enter -999 to exit");
        int readVal = -999;
        readVal = sc.nextInt();
        while (readVal != -999) {
            root = insert(root, readVal);
            readVal = sc.nextInt();
        }
        sc.close();
        return root;
    }

    public static void inorder(TreeNode<Integer> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String [] args) {
        TreeNode<Integer> root = null;
        root = createBinaryTree();
        inorder(root);
    }
}
