package leetcode.list;

import java.util.List;

public interface SolutionService {
	
	//15.3Sum
	//http://blog.csdn.net/ljiabin/article/details/40620579
	public List<List<Integer>> threeSum(int[] nums);
	
	//118.Pascal's Triangle
	public List<List<Integer>> generate(int numRows);
	
	//119.Pascal's Triangle II
	public List<Integer> getRow(int rowIndex);
	
	
	//[test] sort
	public int sortIntArr(int[] nums);
}
