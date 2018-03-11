package leetcode.binaryTree;

import java.util.ArrayDeque;

public class TreeNodeServiceImpl implements TreeNodeService {

	public TreeNode createTreeLevelOrderTraversal(String[] arrStr) {
		TreeNode root = null;
		
		if (arrStr.length > 1) {
			root = createTreeLevelOrderTraversalCell(arrStr, 1);
		}
		
		return root;
	}
	
	private TreeNode createTreeLevelOrderTraversalCell(String[] arrStr, int index) {
		if (index < arrStr.length) {
			String tmp = arrStr[index];
			if (!tmp.equals("token")) {
				arrStr[index] = "token";
				TreeNode nodeNew = null;
				if (!tmp.equals("null")) {
					nodeNew = new TreeNode(Integer.valueOf(tmp));
					nodeNew.left = createTreeLevelOrderTraversalCell(arrStr, index*2);
					nodeNew.right = createTreeLevelOrderTraversalCell(arrStr, index*2+1);
				}
				return nodeNew;
			}
		}
		return null;
	}
	
	
	public void printLevelOrderTraversal(TreeNode root) {
		System.out.print("bTree: ");
		
		if (null == root) {
			return;
		}
		
		ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode nodePrint = queue.remove();
			System.out.print(nodePrint.val+", ");
			if(null != nodePrint.left) {
				queue.add(nodePrint.left);
				
			}
			if(null != nodePrint.right) {
				queue.add(nodePrint.right);
				
			}
		}
		
		System.out.println("");
	}
	
}
