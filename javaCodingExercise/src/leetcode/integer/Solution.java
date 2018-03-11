package leetcode.integer;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SolutionService solutionService = new SolutionServiceImpl();
		
		//Q7
//		int val = solutionService.reverse(123);
//		System.out.println("\n[val]:"+val+"\n");
//		val = solutionService.reverse(-123);
//		System.out.println("\n[val]:"+val+"\n");
		
		//Q9
//		boolean ret = solutionService.isPalindrome(12321);
//		System.out.println("\n[ret]: "+ret);
//		ret = solutionService.isPalindrome(1232);
//		System.out.println("\n[ret]: "+ret);
//		ret = solutionService.isPalindrome(-1232);
//		System.out.println("\n[ret]: "+ret);
//		ret = solutionService.isPalindrome(-12321);
//		System.out.println("\n[ret]: "+ret);
//		ret = solutionService.isPalindrome(-1);
//		System.out.println("\n[ret]: "+ret);
//		ret = solutionService.isPalindrome(1553443551);
//		System.out.println("\n[ret]: "+ret);
		
		//Q11
//		int ret;
//		int[][] test = {
//				{1,2,3},
//				{0,2},
//				{1,2,4,3},
//				{3,2,1,3}
//		};
//		for (int i = 0; i < test.length; i++) {
//			ret = solutionService.maxArea(test[i]);
//			System.out.println("[ret]: "+ret+"\n");
//		}
		
		//Q70
		int ret;
		ret = solutionService.climbStairs(2);
		System.out.println("[ret]: "+ret+"\n");
		ret = solutionService.climbStairs(3);
		System.out.println("[ret]: "+ret+"\n");
		
	}

}
