package trees.binarytrees;

/*
 * Time Complexity - O(n)
 * Space Complexity - O(n) (Worst case, Best case - O(log(n))) (Size of recursive call stack)
 * n - number of nodes
 */
public class MaxDepth {

    // public static int max(int a, int b) {
    //     return (a > b) ? a : b;
    // }

    public static int maxDepth(TreeNode<Integer> root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
    public static void main(String [] args) {
        TreeNode<Integer> root = null;
        root = BinaryTree.createBinaryTree();
        int depth = maxDepth(root);
        System.out.println("Max depth of the binary tree is: " + depth);
    }
}
