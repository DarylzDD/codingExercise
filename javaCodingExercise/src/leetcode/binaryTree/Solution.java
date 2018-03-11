package leetcode.binaryTree;

import java.util.List;

public class Solution {

	public static void main(String[] args) {
		
		SolutionService solutionService = new SolutionServiceImpl();
		
		TreeNodeService treeNodeService = new TreeNodeServiceImpl();
		
		//Q108
//		int[] nums1 = {1,2,3,4};
//		solutionService.sortedArrayToBST(nums1);
//		System.out.println("-------------");
//		int[] nums2 = {1,2,3,4,5};
//		solutionService.sortedArrayToBST(nums2);
//		System.out.println("-------------");
//		int[] nums3 = {1};
//		solutionService.sortedArrayToBST(nums3);
		
		//Q100
		// create bTree
//		String[] bTreeStr1 = {"token", "1", "2", "3"};
//		String[] bTreeStr1 = {"token", "1", "2"};
//		String[] bTreeStr1 = {"token", "1", "2", "1"};
//		TreeNode bTree1 = treeNodeService.createTreeLevelOrderTraversal(bTreeStr1);
//		treeNodeService.printLevelOrderTraversal(bTree1);
//		String[] bTreeStr2 = {"token", "1", "2", "3"};
//		String[] bTreeStr2 = {"token", "1", "null", "2"};
//		String[] bTreeStr2 = {"token", "1", "1", "2"};
//		TreeNode bTree2 = treeNodeService.createTreeLevelOrderTraversal(bTreeStr2);
//		treeNodeService.printLevelOrderTraversal(bTree2);
		// solution
//		boolean ret = solutionService.isSameTree(bTree1, bTree2);
//		System.out.println("ret: "+ret);
		
		//Q101
		// create bTree
//		String[] bTreeStr = {"token", "1", "2", "2", "3", "4", "4", "3"};
//		String[] bTreeStr = {"token", "1", "2", "2", "null", "3", "null", "3"};
//		String[] bTreeStr = {"token", "2","3","3","4","5","5","4","null","null","8","9","null","null","9","8"};
//		TreeNode bTree = treeNodeService.createTreeLevelOrderTraversal(bTreeStr);
		// solution
//		boolean ret = solutionService.isSymmetric(bTree);
//		System.out.println("ret: "+ret);
		
		//Q104
		// create bTree
//		String[] bTreeStr = {"token", "3", "9", "20", "null", "null", "15", "7"};
//		TreeNode bTree = treeNodeService.createTreeLevelOrderTraversal(bTreeStr);
		// solution
//		treeNodeService.printLevelOrderTraversal(bTree);
//		int ret = solutionService.maxDepth(bTree);
//		treeNodeService.printLevelOrderTraversal(bTree);
//		System.out.println("ret: "+ret);
		
		//Q107
		// create bTree
//		String[] bTreeStr = {"token", "3", "9", "20", "null", "null", "15", "7"};
//		TreeNode bTree = treeNodeService.createTreeLevelOrderTraversal(bTreeStr);
		// solution
//		treeNodeService.printLevelOrderTraversal(bTree);
//		List<List<Integer>> results = solutionService.levelOrderBottom(bTree);
//		System.out.println("ret: [");
//		for (List<Integer>result: results) {
//			System.out.print("[");
//			for (Integer val: result) {
//				System.out.print(val+", ");
//			}
//			System.out.println("]");
//		}
//		System.out.println("]");
		
		//Q110
		// create bTree
//		String[] bTreeStr = {"token", "3", "9", "20", "null", "null", "15", "7"};
//		String[] bTreeStr = {"token", "1","2","2","3","3","null","null","4","4"};
//		TreeNode bTree = treeNodeService.createTreeLevelOrderTraversal(bTreeStr);
		// solution
//		treeNodeService.printLevelOrderTraversal(bTree);
//		System.out.println("========================");
//		boolean ret = solutionService.isBalanced(bTree);
//		System.out.println("ret: "+ret);
		
		//Q111
		// create bTree
//		String[] bTreeStr = {"token", "3", "9", "20", "null", "null", "15", "7"};
//		String[] bTreeStr = {"token", "1", "2"};
//		String[] bTreeStr = {"token", "1", "2", "3"};
//		String[] bTreeStr = {"token", "1","2","null","3","null","4","null","5"};
//		TreeNode bTree = treeNodeService.createTreeLevelOrderTraversal(bTreeStr);
		// solution
//		treeNodeService.printLevelOrderTraversal(bTree);
//		int ret = solutionService.minDepth(bTree);
//		System.out.println("ret: "+ret);
		
		//Q112
		// create bTree
		String[] bTreeStr = {"token","5","4","8","11","null","13","4","7","2","null","null","null","1"};
		TreeNode bTree = treeNodeService.createTreeLevelOrderTraversal(bTreeStr);
		// solution
		treeNodeService.printLevelOrderTraversal(bTree);
		boolean ret = solutionService.hasPathSum(bTree, 22);
		System.out.println("ret: "+ret);
		
	}
	
}
