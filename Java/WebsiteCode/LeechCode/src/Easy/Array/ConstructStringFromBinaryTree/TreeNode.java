package Easy.Array.ConstructStringFromBinaryTree;

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

    public static TreeNode addNode(Object[] arr){

        class sortedDepth {
            static Object[] sort(Object[] arr) {
                return new Object[2];
            }
        }

        Object[] arrSortedGraph = sortedDepth.sort(arr);

        return new TreeNode();
    }

    public static void main(String[] args) {
        Object[] b = new Object[2];
        TreeNode.addNode(b);
    }
    
}
