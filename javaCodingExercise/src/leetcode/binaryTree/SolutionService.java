package leetcode.binaryTree;

import java.util.List;

public interface SolutionService {

	//108.Convert Sorted Array to Binary Search Tree
	public TreeNode sortedArrayToBST(int[] nums);
	
	//100.Same Tree
	public boolean isSameTree(TreeNode p, TreeNode q);
	
	//101.Symmetric Tree
	//http://blog.csdn.net/derrantcm/article/details/47333335
	public boolean isSymmetric(TreeNode root);
	
	//104.Maximum Depth of Binary Tree
	public int maxDepth(TreeNode root);
	
	//107.Binary Tree Level Order Traversal II
	public List<List<Integer>> levelOrderBottom(TreeNode root);
	
	//110.Balanced Binary Tree
	public boolean isBalanced(TreeNode root);
	
	//111.Minimum Depth of Binary Tree
	public int minDepth(TreeNode root);
	
	//112.Path Sum
	public boolean hasPathSum(TreeNode root, int sum);
	
}
