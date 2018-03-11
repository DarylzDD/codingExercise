package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SolutionServiceImpl implements SolutionService {

	public int[] twoSum(int[] nums, int target) {
		int[] ret = new int[]{0,0};
		
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					ret[0] = i;
					ret[1] = j;
					break;
				}
			}
		}
		
		return ret;
	}
	
	
	public int removeDuplicates(int[] nums) {
		
		if (nums.length == 0) {
			return 0;
		}
		
		int lenDup = 1;
		int tmp = nums[nums.length-1];
		for (int i = nums.length-2; i >= 0; i--) {
			if (tmp != nums[i]) {
				lenDup++;
				tmp = nums[i];
			} else {
				copy(nums, i, lenDup);
			}
		}
		
		return lenDup;
	}
	
	private void copy(int[] arr, int pos, int copyLen) {
		for(int i = 0; i < copyLen; i++) {
			arr[pos+i] = arr[pos+1+i];
		}
	}
	
	
//	public int removeElement(int[] nums, int val) {
//		if (nums.length == 0) {
//			return 0;
//		}
//		
//		int len = 0;
//		int posReplace = 0;
//		int posMove = 0;
//		for (int i = 0; i < nums.length; i++) {
//			System.out.println("i:"+i+", nums:"+nums[i]+", len:"+len+", val:"+val);
//			if (nums[i] == val) {
//				if (nums[posReplace] == val) {
//					System.out.println("same-posOK, i:"+i+", nums:"+nums[i]+", val:"+val+", pos:"+posReplace+", nums.pos:"+nums[posReplace]);
//				} else {
//					posReplace = findPosReplace(nums, val, posReplace, i);
//					System.out.println("same-posMoveOK, i:"+i+", nums:"+nums[i]+", val:"+val+", pos:"+posReplace+", nums.pos:"+nums[posReplace]);
//				}
//			} else {
//				while (posMove < i) {
//					if (nums[posMove] != val && nums[posReplace] == val) {
//						nums[posReplace] = nums[posMove];
//						posReplace = findPosReplace(nums, val, posReplace, i);
//					}
//					posMove++;
//				}
//				len++;
//				System.out.println("diff, len:"+len);
//			}
//		}
//		
//		return len;
//	}
//	
//	private int findPosReplace(int[] nums, int val, int start, int lenMax) {
//		int posReplace = start;
//		while (posReplace < lenMax) {
//			System.out.println("same-posMove, val:"+val+", pos:"+posReplace+", nums.pos:"+nums[posReplace]);
//			if (nums[posReplace] == val) {
//				break;
//			}
//			posReplace++;
//		}
//		return posReplace;
//	}
	
	public int removeElement(int[] nums, int val) {
		if (nums.length == 0) {
			return 0;
		}
		
		int len = 0;
		int posReplace = 0;
		for (int i = 0; i < nums.length; i++) {
			System.out.println(">>>>\ni:"+i+", nums:"+nums[i]+", len:"+len+", val:"+val);
			if (nums[i] == val) {
//				posReplace = findPosReplace(nums, val, posReplace, i);
				
			} else {
				posReplace = findPosReplace(nums, val, posReplace, i);
				System.out.println("same-posMove-replaceBefore, nums.i:"+nums[i]+" nums.pos:"+nums[posReplace]);
				replace(nums, posReplace, i);
				System.out.println("same-posMove-replaceAfter, nums.i:"+nums[i]+" nums.pos:"+nums[posReplace]);
				printArr(nums);
				len++;
				System.out.println("diff, len:"+len);
			}
		}
		
		return len;
	}
	
	private int findPosReplace(int[] nums, int val, int start, int lenMax) {
		int posReplace = start;
		while (posReplace < lenMax) {
			System.out.println("same-posMove, val:"+val+", pos:"+posReplace+", nums.pos:"+nums[posReplace]);
			if (nums[posReplace] == val) {
				break;
			}
			posReplace++;
		}
		System.out.println("same-posMove, val:"+val+", pos:"+posReplace+", nums.pos:"+nums[posReplace]);
		return posReplace;
	}
	
	private void replace(int[] nums, int pos1, int pos2) {
		int tmp = nums[pos1];
		nums[pos1] = nums[pos2];
		nums[pos2] = tmp;
	}
	
	private void printArr(int[] nums) {
		System.out.print(">> nums: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+", ");
		}
		System.out.println("");
	}
	
	
	public int searchInsert(int[] nums, int target) {
		
		int ret = 0;
		if (nums[nums.length-1] < target) {
			return nums.length;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				ret = i;
				break;
			} else if (nums[i] < target) {
				ret = i;
			} else {
				ret = i;
				break;
			}
		}
		
		return ret;
	}
	
	
	public int maxSubArray(int[] nums) {
		
		if (nums.length == 0) {
			return 0;
		}
		
		int sum = 0;
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sum > max) {
				max = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		
		return max;
	}
	
	
	public int[] plusOne(int[] digits) {
		int c = 0;
		for (int i = digits.length-1; i >= 0; i--) {
			if (i == digits.length-1) {
				digits[i]++;
			} else {
				digits[i] += c;
			}
			
			c = digits[i] / 10;
			digits[i] = digits[i] % 10;
		}
		
		if (c == 0) {
			return digits;
		} else {
			int[] ret = new int[digits.length+1];
			ret[0] = c;
			for(int i = 1; i < ret.length; i++) {
				ret[i] = digits[i-1];
			}
			return ret;
		}
	}
	
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if(nums2.length == 0) {
			return;
		}
		if(nums1.length == 0) {
			copyIntArr(nums1, 0, nums2, 0);
			return;
		}
		
		int pos1 = 0;
		int pos2 = 0;
		while (pos1 < (n+m) && pos2 < n) {
			if (pos1 == (m+pos2)) {
				copyIntArr(nums1, pos1, nums2, pos2);
				break;
			}
			if (nums1[pos1] > nums2[pos2]) {
				moveIntArr(nums1, pos1);
				nums1[pos1] = nums2[pos2];
				pos2++;
			} else {
				pos1++;
			}
		}
	}
	
	private void copyIntArr(int[] nums1, int pos1, int[] nums2, int pos2) {
		for (int i = 0; i < nums2.length - pos2; i++) {
			nums1[pos1+i] = nums2[pos2+i];
		}
	}
	
	private void moveIntArr(int[] nums, int pos) {
		for(int i = nums.length-1; i > pos; i--) {
			nums[i] = nums[i-1];
		}
	}
	
	
//	public int maxProfit(int[] prices) {
//		
//		int profit = 0;
//		
//		for(int i = 0; i < prices.length; i++) {
//			for(int j = i+1; j < prices.length; j++) {
//				int diff = prices[j] - prices[i];
//				if (diff > profit) {
//					profit = diff;
//				}
//			}
//		}
//		
//		return profit;
//	}
	
	public int maxProfitI(int[] prices) {
		
		if (prices.length == 0) {
			return 0;
		}
		
		int profit = 0;
		int min = prices[0];
		int sum = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
				sum = 0;
			}
			sum = prices[i] - min;
			if (sum > profit) {
				profit = sum;
			}
		}
		
		return profit;
	}
	
	
	public int maxProfitII(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}
		
		int profit = 0;
		
		for (int i = 0; i < prices.length - 1; i++) {
			int tmp = prices[i+1]-prices[i];
			if (tmp > 0) {
				profit += tmp;
			}
		}
		
		return profit;
	}
	
	public int singleNumber(int[] nums) {
		int target = 0;
		for(int i = 0; i < nums.length; i++) {
			target ^= nums[i];
			System.out.println("target="+target);
		}
		return target;
	}
	
}
