package leetcode.binaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionServiceImpl implements SolutionService {
	
	private TreeNode recursion(int[]nums, int left, int right) {
		
		if (0 == right - left) {
			System.out.println("return 0, left: "+left+", right: "+right);
			return new TreeNode(nums[left]);
		} else if (1 == right - left) {
			System.out.println("return 1, left: "+left+", right: "+right);
			TreeNode bRoot = new TreeNode(nums[right]);
			TreeNode bLeft = new TreeNode(nums[left]);
			bRoot.left = bLeft;
			return bRoot;
		} else {
			int mid = (right + left)/2;
			int mid_left = mid-1 > left ? mid-1 : left;
			int mid_right = mid+1 < right ? mid+1 : right;
			
			System.out.println("mid: "+mid+", left: ["+left+", "+mid_left+"], right: ["+mid_right+", "+right+"]");
			
			TreeNode root = new TreeNode(nums[mid]);
			
			root.left = recursion(nums, left, mid_left);
			
			root.right = recursion(nums, mid_right, right);
			
			return root;
		}
		
	}

	public TreeNode sortedArrayToBST(int[] nums) {
		
		if (0 == nums.length) {
			return null;
		} else if (1 == nums.length) {
			return new TreeNode(nums[0]);
		} else {
			return this.recursion(nums, 0, nums.length-1);
		}
		
	}
	
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		
		if (null == p && null != q) {
			return false;
		} else if (null == q && null != p) {
			return false;
		} else if (null == p && null == q) {
			return true;
		}
		
		ArrayDeque<TreeNode> queueP = new ArrayDeque<TreeNode>();
		ArrayDeque<TreeNode> queueQ = new ArrayDeque<TreeNode>();
		queueP.add(p);
		queueQ.add(q);
		while((!queueP.isEmpty()) && (!queueQ.isEmpty())) {
			TreeNode nodeP = queueP.remove();
			TreeNode nodeQ = queueQ.remove();
			if (nodeP.val != nodeQ.val) {
				return false;
			}
			if (null != nodeP.left) {
				queueP.add(nodeP.left);
			} else if (null != nodeP.right) {
				queueP.add(new TreeNode(0));
			}
			if (null != nodeP.right) {
				queueP.add(nodeP.right);
			} else if (null != nodeP.left) {
				queueP.add(new TreeNode(0));
			}
			if (null != nodeQ.left) {
				queueQ.add(nodeQ.left);
			} else if (null != nodeQ.right) {
				queueQ.add(new TreeNode(0));
			}
			if (null != nodeQ.right) {
				queueQ.add(nodeQ.right);
			} else if (null != nodeQ.left) {
				queueQ.add(new TreeNode(0));
			}
		}
		if((queueP.isEmpty()) && (queueQ.isEmpty())) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	public boolean isSymmetric(TreeNode root) {
		
		if (null == root) {
			return true;
		} else {
			return isSymmetricCell(root.left, root.right);
		}
	}
	
	private boolean isSymmetricCell(TreeNode node1, TreeNode node2) {
		if ((node1 == null) && (node2 == null)) {
			return true;
		} else if ((node1 != null) && (node2 == null)) {
			return false;
		} else if ((node1 == null) && (node2 != null)) {
			return false;
		} else {
			return ((node1.val == node2.val) && (isSymmetricCell(node1.left, node2.right)) && (isSymmetricCell(node1.right, node2.left)));
		}
	}
	
	
	public int maxDepth(TreeNode root) {
		if (null == root) {
			return 0;
		}
		
		ArrayDeque<TreeNode> stack = new ArrayDeque<TreeNode>();
		
		root.val = 1;
		int depth = root.val;
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode nodeNow = stack.pop();
			if (null != nodeNow.right) {
				nodeNow.right.val = nodeNow.val + 1;
				if (nodeNow.right.val > depth) {
					depth = nodeNow.right.val;
				}
				stack.push(nodeNow.right);
			}
			if (null != nodeNow.left) {
				nodeNow.left.val = nodeNow.val + 1;
				if (nodeNow.left.val > depth) {
					depth = nodeNow.left.val;
				}
				stack.push(nodeNow.left);
			}
		}
		
		return depth;
	}
	
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {

		List<List<Integer>> result107 = new ArrayList<>();
        
        if (null == root) {
			return result107;
		}
		
		levelOrderBottomCell(result107, root, 0);
        
        Collections.reverse(result107);
		
		return result107;
	}
	
	private void levelOrderBottomCell(List<List<Integer>> result, TreeNode node, int level) {
		if (null != node) {
			if (result.size() > level) {
				result.get(level).add(node.val);
			} else {
				List<Integer> newArr = new ArrayList<Integer>();
				newArr.add(node.val);
				result.add(newArr);
			}
			System.out.println("val:"+node.val+", level:"+level);
			if(null != node.left) {
				int levelLeft = level+1;
				System.out.println("left--val:"+node.left.val+", levelLeft:"+levelLeft);
				levelOrderBottomCell(result, node.left, levelLeft);
			}
			if(null != node.right) {
				int levelRight = level+1;
				System.out.println("right--val:"+node.right.val+", levelRight:"+levelRight);
				levelOrderBottomCell(result, node.right, levelRight);
			}
		} else {
			return;
		}
	}
	
	
	private TreeNodeService treeNodeService = new TreeNodeServiceImpl();
	
	public boolean isBalanced(TreeNode root) {
		
		if (null == root) {
			return true;
		}
		int depthLeft = depthRecursion(root.left);
		int depthRight = depthRecursion(root.right);
		treeNodeService.printLevelOrderTraversal(root);
		System.out.println("depthLeft: "+depthLeft+", depthRight: "+depthRight);
		System.out.println("-----------------------");
		if (!((depthLeft - depthRight < 2) && (depthRight - depthLeft < 2))) {
			return false;
		}
		
		return isBalanced(root.left) && isBalanced(root.right);
	}
	
	private int depthRecursion(TreeNode node) {
		if (null == node) {
			return 0;
		}
		int depthLeft = depthRecursion(node.left) + 1;
		int depthRight = depthRecursion(node.right) + 1;
		
		if (depthLeft > depthRight) {
			return depthLeft;
		} else {
			return depthRight;
		}
	}
	
	
	public int minDepth(TreeNode root) {
		
		if (null == root) {
			return 0;
		} else if ((null == root.left) && (null == root.right)) {
			return 1;
		}
		
		return minDepthRecursion(1, root);
	}
	
	private int minDepthRecursion(int depth, TreeNode node) {
		if (null == node) {
			return depth;
		} else if ((null == node.left) && (null == node.right)) {
			return depth++;
		}
		depth++;
		int depthLeft = minDepthRecursion(depth, node.left);
		int depthRight = minDepthRecursion(depth, node.right);
		System.out.print("depthLeft:"+depthLeft+", depthRight:"+depthRight);
		
		if ((null != node.left) && (null == node.right)) {
			System.out.println(" -- right");
			return depthLeft;
		} else if ((null == node.left) && (null != node.right)) {
			System.out.println(" -- left");
			return depthRight;
		} else {
			System.out.println(" -- left & right");
			if (depthLeft < depthRight) {
				return depthLeft;
			} else {
				return depthRight;
			}
		}
	}
	
	
	public boolean hasPathSum(TreeNode root, int sum) {
		
		if (null == root) {
			return false;
		}
		
		ArrayDeque<TreeNode> stack = new ArrayDeque<TreeNode>();
		
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (null != node.right) {
				node.right.val += node.val;
				stack.push(node.right);
			}
			if (null != node.left) {
				node.left.val += node.val;
				stack.push(node.left);
			}
			if ((null == node.left) && (null == node.right)) {
				if (node.val == sum) {
					return true;
				}
			}
		}
		
		return false;
	}
	
}
