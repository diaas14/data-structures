package trees.binarytrees;

public class SymmetricTrees {

    public static boolean isInverse(TreeNode<Integer> root1, TreeNode<Integer> root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null || root1.val != root2.val)
            return false;
        return isInverse(root1.left, root2.right) && isInverse(root1.right, root2.left);
    }
    
    public static boolean isSymmetric(TreeNode<Integer> root) {
        if (root == null) return true;
        return isInverse(root.left, root.right);
    }

    public static void main(String [] args) {
        TreeNode<Integer> root = null;
        root = BinaryTree.createBinaryTree();
        System.out.println("Displaying tree");
        BinaryTree.inorder(root);
        System.out.print("\n");
        boolean res = isSymmetric(root);
        System.out.println("The tree is symmetric? " + res);
    }
}
