package leetcode.list;

import java.util.List;

public class Solution {
	
	
	private static void printListListInteger(List<List<Integer>> list) {
		if (list == null) {
			System.out.println("list=[]");
			return;
		}
		System.out.println("list=[");
		for (List<Integer>li: list) {
			System.out.print("  [");
			for (Integer i: li) {
				System.out.print(i+", ");
			}
			System.out.println("  ],");
		}
		System.out.println("]");
	}
	
	
	private static void printListInteger(List<Integer> list) {
		if (list == null) {
			System.out.println("list=[]");
			return;
		}
		System.out.print("list=[");
		for (Integer i: list) {
			System.out.print(i+", ");
		}
		System.out.println("]");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SolutionService solutionService = new SolutionServiceImpl();

		//Q15
//		int[] nums = {-1, 0, 1, 2, -1, -4};
//		int[] nums = {-1, 0, 1, 2, -1, -4, -1, -1, 1, 1, 1};
//		List<List<Integer>> retList = solutionService.threeSum(nums);
//		printListListInteger(retList);
		
		//Q118
//		List<List<Integer>> ret = solutionService.generate(5);
//		printListListInteger(ret);
		
		//Q119
		List<Integer> ret = solutionService.getRow(5);
		printListInteger(ret);
		
	}

}
