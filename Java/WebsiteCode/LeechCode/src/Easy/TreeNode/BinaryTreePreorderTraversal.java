package Easy.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate cursor-text whitespace-normal hover:!text-[inherit]" href="/problems/binary-tree-preorder-traversal/">144.Binary Tree Preorder Traversal</a>
 * 
 * <div class="elfjS" data-track-load="description_content"><p>Given the <code>root</code> of a binary tree, return <em>the preorder traversal of its nodes' values</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/15/inorder_1.jpg" style="width: 125px; height: 200px;">
<pre><strong>Input:</strong> root = [1,null,2,3]
<strong>Output:</strong> [1,2,3]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> root = []
<strong>Output:</strong> []
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> root = [1]
<strong>Output:</strong> [1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[0, 100]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> Recursive solution is trivial, could you do it iteratively?</p>
</div>
 */
public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        Object[][] tests = {
            {1,null,2,3},
            {1},
            {},
        };

        for (Object[] arr : tests) {
            TreeNode root = TreeNode.addNode(arr,0);

            System.out.println(new BinaryTreePreorderTraversal_Solution().preorderTraversal(root));
        }
    }
}

// 0 ms 41.6 MB
class BinaryTreePreorderTraversal_Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if (root != null) {addNode(ans, root);}

        return ans;
    }

    public void addNode(List<Integer> arr, TreeNode root) {
        arr.add(root.val);

        if (root.left != null) {addNode(arr, root.left);}
        if (root.right != null) {addNode(arr, root.right);}
    }
}