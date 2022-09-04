package trees.binarytrees;

public class InvertTree {
    public static void invert(TreeNode<Integer> root) {
        if (root == null) return;

        invert(root.left);
        invert(root.right);

        TreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static void main(String [] args) {
        TreeNode<Integer> root = null;
        root = BinaryTree.createBinaryTree();
        System.out.println("Displaying tree before inversion");
        BinaryTree.inorder(root);
        System.out.print("\n");
        invert(root);
        System.out.println("Displaying tree after inversion");
        BinaryTree.inorder(root);
        System.out.print("\n");
    }
}
