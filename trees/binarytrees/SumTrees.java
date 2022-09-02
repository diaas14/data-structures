package trees.binarytrees;

/*
 * Time Complexity - O (m + n)
 * Space Complexity - O(max(m, n))
 * m - nodes in tree 1
 * n - nodes in tree 2
 */

public class SumTrees {

    public static TreeNode<Integer> sumMerge(TreeNode<Integer> root1, TreeNode<Integer> root2) {
        if (root1 == null && root2 == null)
            return null;
        if (root1 == null && root2 != null)
            return root2;
        if (root1 != null && root2 == null)
            return root1;

        TreeNode <Integer> root = new TreeNode<>(root1.val + root2.val);

        root.left = sumMerge(root1.left, root2.left);
        root.right = sumMerge(root1.right, root2.right);

        return root;
    }

    public static void main(String [] args) {
        TreeNode<Integer> root1 = null, root2 = null, root = null;
        root1 = BinaryTree.createBinaryTree();
        System.out.println("Displaying tree 1");
        BinaryTree.inorder(root1);
        System.out.print("\n");
        root2 = BinaryTree.createBinaryTree();
        System.out.println("Displaying tree 2");
        BinaryTree.inorder(root2);
        System.out.print("\n");
        root = sumMerge(root1, root2);
        System.out.println("Displaying merged tree");
        BinaryTree.inorder(root);
        System.out.print("\n");
    }
}
