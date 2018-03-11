package leetcode.integer;

public class SolutionServiceImpl implements SolutionService {

	public int reverse(int x) {
		
		MyStackQ7 stack = new MyStackQ7();
		
		String s = new String();
		s = String.valueOf(x);
		
		System.out.println("lalalalalala:"+s+", len:"+s.length());
		
		boolean isNegative = false;
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '-') {
				isNegative = true;
				continue;
			}
			System.out.println("["+i+"]:"+s.charAt(i));
			stack.push(Character.getNumericValue(s.charAt(i)));
		}
		System.out.println("----------------");
		long retLong = 0;
		while(!stack.isEmpty()) {
			int tmp = stack.pop();
			System.out.println("[pop]:"+tmp);
			retLong = retLong * 10 + tmp;
		}
		System.out.println("retLong:"+retLong);
		String retLongStr = new String();
		retLongStr = String.valueOf(retLong);
		if (isNegative) {
			retLongStr = '-' + retLongStr;
		}
		System.out.println("retLong string:"+retLongStr);
		retLong = Long.parseLong(retLongStr);
		System.out.println("retLong final:"+retLong);
		try{
            int retInt = Integer.parseInt(retLongStr);
		
            long retIntToLong = new Long(retInt);
            if (retLong == retIntToLong) {
                return retInt;
            } else {
                return 0;
            }
        } catch(Exception e) {
            return 0;
        }
		
	}
	
	
	public boolean isPalindrome(int x) {
		
		if (x >= 0 && x < 10) {
			return true;
		} else if (x < 0) {
            return false;
        }
		
		int xOri = x;
		int rev = 0;
		while (x != 0) {
			rev = rev * 10 + (x % 10);
			x /= 10;
		}
		
		if (rev == xOri) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	public int maxAreaBak(int[] height) {
		
		if (height.length < 2) {
			return 0;
		}
		
		int maxArea = (height[1] <= height[0]) ? height[1] : height[0];
		int y = 0;
		for (int i = 0; i < height.length-1; i++) {
			for (int j = i+1; j < height.length; j++) {
				y = (height[j] <= height[i]) ? height[j] : height[i];
				if ( (j-i)*y > maxArea ) {
					maxArea = (j-i)*y;
				}
			}
		}
		
		return maxArea;
	}

	public int maxArea(int[] height) {
		
		if (height.length < 2) {
			return 0;
		}
		
		int maxArea = 0;
		int y = 0;
		for (int i = 0, j = height.length-1; i < j; ) {
			y = (height[j] <= height[i]) ? height[j] : height[i];
			maxArea = ((j-i)*y > maxArea) ? ((j-i)*y) : maxArea;
			if (height[i] > height[j]) {
				j--;
			} else {
				i++;
			}
		}
		
		return maxArea;
	}
	
		
	public int climbStairs(int n) {
		
		if (n <= 1) {
			return 1;
		}
		
		int[] dp = new int[n];
		
		dp[0] = 1;
		dp[1] = 2;
		
		for (int i = 2; i < n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n-1];
	}
	
}
