package leetcode.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionServiceImpl implements SolutionService {
	
	public List<List<Integer>> threeSum(int[] nums) {
		
		List<List<Integer>> retList = new ArrayList<>();
		
		if (nums == null || nums.length < 3) {		//size
			return retList;
		}
		
//		sortIntArr(nums);
		Arrays.sort(nums);
		
		if (nums[0] > 0 || nums[nums.length-1] < 0) {		// all smaller OR bigger than 0
			return retList;
		}
		
		for(int i = 0; i < nums.length-2; i++) {
			if (i > 0 && nums[i] == nums[i-1]) {
				continue;
			}
			findThreeSum(nums, i+1, nums.length-1, nums[i], retList);
		}
		
		return retList;
	}
	
	private void findThreeSum(int[] nums, int left, int right, int target, List<List<Integer>> ret) {
		while(left < right) {
//			System.out.println("left="+left+", right="+right+", target="+target);
			int sum = nums[left] + nums[right] + target;
			if (sum == 0) {
				List<Integer> tmp = new ArrayList<Integer>();
				tmp.add(nums[left]);
				tmp.add(nums[right]);
				tmp.add(target);
				ret.add(tmp);
				while(left < right && nums[left] == nums[left+1]) {
					left++;
				}
				while(left < right && nums[right] == nums[right-1]) {
					right--;
				}
				left++;
				right--;
			} else if (sum < 0) {
				left++;
			} else {
				right--;
			}
		}
	}
	
	
	private void printIntArr(int[] nums) {
		System.out.print("int["+nums.length+"]=[");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+", ");
		}
		System.out.println("]");
	}
	
	private void swp(int[] nums, int x, int y) {
		int tmp = nums[x];
		nums[x] = nums[y];
		nums[y] = tmp;
	}
	
	private void sortCell(int[] nums, int left, int right) {
		if (left > right) {
			return ;
		}
		int rev = nums[left];
		int i = left;
		int j = right;
		for (; i != j; ) {
			while (nums[j] >= rev && i < j) {
				j--;
			}
			while (nums[i] <= rev && i < j) {
				i++;
			}
			if (i < j) {
				swp(nums, i, j);
			}
		}
		nums[left] = nums[i];
		nums[i] = rev;
		
		sortCell(nums, left, i-1);
		sortCell(nums, i+1, right);
	}
	
	public int sortIntArr(int[] nums) {
		
		printIntArr(nums);
		
		sortCell(nums, 0, nums.length-1);		
		
		printIntArr(nums);
		
		return 0;
	}
	
	
	public List<List<Integer>> generate(int numRows) {
		
		List<List<Integer>> results = new ArrayList<>();
		
		if (numRows <= 0) {
			return results;
		}
		
		for (int i = 0; i < numRows; i++) {
//			System.out.print("i:"+i);
			if (0 == i) {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				results.add(arr);
			} else if (1 == i) {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(1);
				results.add(arr);
			} else {
//				System.out.print(", seed:"+results.get(i-1));
				List<Integer> arr = new ArrayList<Integer>();
				List<Integer> seed = results.get(i-1);
				arr.add(1);
				for(int j = 0; j < seed.size()-1; j++) {
					arr.add(seed.get(j)+seed.get(j+1));
				}
				arr.add(1);
				results.add(arr);
			}
//			System.out.println("");
		}
		
		return results;
	}
	
	
	public List<Integer> getRow(int rowIndex) {
		
		List<List<Integer>> results = new ArrayList<>();
		
		rowIndex++;
		
		if (rowIndex <= 0) {
			return new ArrayList<Integer>();
		}
		
		for (int i = 0; i < rowIndex; i++) {
//			System.out.print("i:"+i);
			if (0 == i) {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				results.add(arr);
			} else if (1 == i) {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(1);
				results.add(arr);
			} else {
//				System.out.print(", seed:"+results.get(i-1));
				List<Integer> arr = new ArrayList<Integer>();
				List<Integer> seed = results.get(i-1);
				arr.add(1);
				for(int j = 0; j < seed.size()-1; j++) {
					arr.add(seed.get(j)+seed.get(j+1));
				}
				arr.add(1);
				results.add(arr);
			}
//			System.out.println("");
		}
		
		return results.get(rowIndex-1);
	}

}
