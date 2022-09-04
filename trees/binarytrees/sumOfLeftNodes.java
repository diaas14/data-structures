package trees.binarytrees;

public class sumOfLeftNodes {
    
    public static int calcSum(TreeNode<Integer> root, boolean left) {
        if (root == null) 
            return 0;
        if (root.left == null && root.right == null && left) 
            return root.val;
        return calcSum(root.left, true) + calcSum(root.right, false);
    }

    public static void main(String [] args) {
        TreeNode<Integer> root = null;
        root = BinaryTree.createBinaryTree();
        int res = calcSum(root, true);
        System.out.println("The sum is: " + res);
    }
}