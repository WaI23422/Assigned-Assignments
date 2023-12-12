package BetterCodeAnswer.Easy.Array.SameTree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode addNode(Object[] arr,int i){
        TreeNode root = null;
        // Base case for recursion
        if (i < arr.length) {
            if (arr[i] == null) { return new TreeNode();}

            root = new TreeNode((int) arr[i]);
 
            // insert left child
            root.left = addNode(arr, 2 * i + 1);
 
            // insert right child
            root.right = addNode(arr, 2 * i + 2);
        }
        return root;
    }
}
