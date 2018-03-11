package leetcode.array;

public class Solution {
	
	public static void printIntArr(int[] arr) {
		System.out.print("arr:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println("");
	}
	
	public static void printIntArrLen(int[] arr, int arrLen) {
		System.out.print("arr:");
		for(int i = 0; i < arrLen; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println("");
	}
	

	public static void main(String[] args) {
		
		SolutionService solutionService = new SolutionServiceImpl();
		
		//Q1
//		int[] nums = {2,7,11,13};
//		int target = 9;
//		int[] ret = solutionService.twoSum(nums, target);
//		printIntArr(ret);
		
		//Q26
//		int[] nums = {1,1,2};
//		int[] nums = {1,1,2,3,4,4,5,6,6,6,6};
//		int ret = solutionService.removeDuplicates(nums);
//		System.out.println("ret: "+ret);
//		printIntArrLen(nums, ret);
		
		//Q27
//		int[] nums = {3,2,2,3};
//		int ret = solutionService.removeElement(nums, 3);
//		int[] nums = {6,6,1,1,2,3,6,6,4,6,4,6,5,6,6,6,6};
//		int ret = solutionService.removeElement(nums, 6);
//		System.out.println("ret: "+ret);
//		printIntArrLen(nums, ret);
		
		//Q35
//		int[] nums = {1, 3, 5, 7};
//		int target = 5;
//		int ret = solutionService.searchInsert(nums, target);
//		System.out.println("ret: "+ret);
		
		//Q53
//		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//		int ret = solutionService.maxSubArray(nums);
//		System.out.println("ret: "+ret);
		
		//Q66
//		int[] ret;
//		int[] digits = {1,2,3,4};
//		int[] digits = {1,2,3,9};
//		int[] digits = {0};
//		int[] digits = {9,9,9,9};
//		ret = solutionService.plusOne(digits);
//		printIntArr(ret);
		
		//Q88
//		int[] nums1 = {1,2,5,6,7,0,0,0,0,0,0,0,0,0,0};
//		int[] nums2 = {2,3,4,8,9};
//		int[] nums1 = {2, 0};
//		int[] nums2 = {1};
//		System.out.println("nums1:");
//		printIntArr(nums1);
//		System.out.println("nums2:");
//		printIntArr(nums2);
//		solutionService.merge(nums1, 1, nums2, 1);
//		System.out.println("nums1:");
//		printIntArr(nums1);
		
		//Q121
//		int[] nums1 = {7,1,5,3,6,4};
//		int[] nums2 = {7,6,4,3,1};
//		int[] nums3 = {2,4,1,7};
//		int[] nums4 = {2,1,2,1,0,1,2};
//		System.out.println("1. ret: "+solutionService.maxProfitI(nums1)+"\n");
//		System.out.println("2. ret: "+solutionService.maxProfitI(nums2)+"\n");
//		System.out.println("3. ret: "+solutionService.maxProfitI(nums3)+"\n");
//		System.out.println("4. ret: "+solutionService.maxProfitI(nums4)+"\n");
		
		//Q122
//		int[] nums1 = {7,1,5,3,6,4};
//		int[] nums2 = {7,6,4,3,1};
//		int[] nums3 = {2,4,1,7};
//		int[] nums4 = {2,1,2,1,0,1,2};
//		System.out.println("1. ret: "+solutionService.maxProfitII(nums1)+"\n");
//		System.out.println("2. ret: "+solutionService.maxProfitII(nums2)+"\n");
//		System.out.println("3. ret: "+solutionService.maxProfitII(nums3)+"\n");
//		System.out.println("4. ret: "+solutionService.maxProfitII(nums4)+"\n");
		
		//Q136
		int[] nums1 = {1,2,3,4,1,2,3};
		System.out.println("1. ret: "+solutionService.singleNumber(nums1)+"\n");
		
	}
	
}
