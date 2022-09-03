package trees.binarytrees;

/*
 * Time Complexity - O(n)
 * Space Complexity - O(n) (Worst case, Best case - O(log(n))) (Size of recursive call stack)
 * n - number of nodes
 */

public class BinarySum {
    
    public int sum = 0;

    public void calcBinSum(TreeNode<Integer> root, int tempSum) {
        if (root == null) return;
        if (root.left == null && root.right == null) 
            this.sum = sum + tempSum * 2 + root.val;

        calcBinSum(root.left, tempSum * 2 + root.val);
        calcBinSum(root.right, tempSum * 2 + root.val);
    }

    public static void main(String [] args) {
        TreeNode<Integer> root = null;
        root = BinaryTree.createBinaryTree();
        BinarySum solution = new BinarySum();
        solution.calcBinSum(root, 0);
        System.out.println("The binary sum is: " + solution.sum);
    }
}
