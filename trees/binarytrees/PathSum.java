package trees.binarytrees;

import java.util.Scanner;

public class PathSum {
    public static boolean hasSum(TreeNode<Integer> root, int target) {
        if (root == null)
            return false;
        if (root.val == target)
            return true;
        return hasSum(root.left, target - root.val) || hasSum(root.right, target - root.val);
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root = null;
        int target = 0;
        root = BinaryTree.createBinaryTree(); 
        System.out.println("Enter the target value");
        target = sc.nextInt();   
        boolean res = hasSum(root, target);
        System.out.println("Is the target sum present in any of the paths? " + res);
    }
}
