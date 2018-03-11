package leetcode.array;


public interface SolutionService {

	//1.Two Sum
	public int[] twoSum(int[] nums, int target);
	
	//26.Remove Duplicates from Sorted Array
	public int removeDuplicates(int[] nums);
	
	//27.Remove Element
	public int removeElement(int[] nums, int val);
	
	//35.Search Insert Position
	public int searchInsert(int[] nums, int target);
	
	//53.Maximum Subarray
	public int maxSubArray(int[] nums);
	
	//66.Plus One
	public int[] plusOne(int[] digits);
	
	//88.Merge Sorted Array
	public void merge(int[] nums1, int m, int[] nums2, int n);
	
	//121.Best Time to Buy and Sell Stock
	//http://blog.csdn.net/ljiabin/article/details/44900389
	public int maxProfitI(int[] prices);
	
	//122.Best Time to Buy and Sell Stock II
	public int maxProfitII(int[] prices);
	
	//136.Single Number
	public int singleNumber(int[] nums);
	
}
