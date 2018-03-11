package leetcode.string;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SolutionService solutionService = new SolutionServiceImpl();
		
		//Q3
//		solutionService.lengthOfLongestSubstring(new String("abcabcbb"));
//		solutionService.lengthOfLongestSubstring(new String("bbbbb"));
//		solutionService.lengthOfLongestSubstring(new String("pwwkew"));
//		solutionService.lengthOfLongestSubstring(new String("bpfbhmipx"));
		
		//Q5
//		String ret;
//		ret = solutionService.longestPalindrome(new String("babad"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.longestPalindrome(new String("abcdbdca"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.longestPalindrome(new String("aaaaabcdbdcaaa"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.longestPalindrome(new String("aaaaa"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.longestPalindrome(new String("aaaaaa"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.longestPalindrome(new String("aaabaaa"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.longestPalindrome(new String("cbbd"));
//		System.out.println("ret:"+ret);
		
		//Q8
//		int ret;
//		ret = solutionService.myAtoi(new String("123456"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("-123456"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("  1 2   3 4 56  "));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("  1 2   3 4 56  "));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("  1 2-   3 4 56  "));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("  1 2   3 4 56-  "));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("2147483647"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("-2147483648"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("21474836477"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("-21474836488"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("+-2"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("-+2"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("-00134"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("-0012a42"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("   +0 123"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("-01324000"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("2147483647"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("2147483648"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("123 456"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("      -11919730356x"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.myAtoi(new String("         +10523538441s"));
//		System.out.println("ret:"+ret);

		//Q14
//		String ret;
//		String[] strArr1 = {
//				"asdfgh", 
//				"asdfzxcv"
//		};
//		ret = solutionService.longestCommonPrefix(strArr1);
//		System.out.println("ret:"+ret);
		
		//Q20
//		boolean ret;
//		ret = solutionService.isValid(new String("(){}[]"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.isValid(new String("(]"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.isValid(new String("{]"));
//		System.out.println("ret:"+ret);
//		ret = solutionService.isValid(new String("{[()]}"));
//		System.out.println("ret:"+ret);
		
		//Q28
//		int ret;
//		ret = solutionService.strStr(new String("hello"), new String("ll"));
//		ret = solutionService.strStr(new String("aaaaaaaa"), new String("bba"));
//		ret = solutionService.strStr(new String("a"), new String("a"));
//		ret = solutionService.strStr(new String("aaa"), new String("aaa"));
//		ret = solutionService.strStr(new String("mississippi"), new String("pi"));
//		System.out.println("ret:"+ret);
		
		//Q58
//		int ret;
//		ret = solutionService.lengthOfLastWord(new String("hello World"));
//		System.out.println("ret:"+ret);
		
		//Q67
//		String ret;
//		ret = solutionService.addBinary(new String("1100"), new String("111"));
//		System.out.println("ret:"+ret);
		
		//Q125
		boolean ret;
		ret = solutionService.isPalindrome(new String("asdsa"));
		System.out.println("ret:"+ret+"\n");
		ret = solutionService.isPalindrome(new String("asddsa"));
		System.out.println("ret:"+ret+"\n");
		ret = solutionService.isPalindrome(new String("35 as999d sa , "));
		System.out.println("ret:"+ret+"\n");
		ret = solutionService.isPalindrome(new String("0P"));
		System.out.println("ret:"+ret+"\n");
		ret = solutionService.isPalindrome(new String("aA"));
		System.out.println("ret:"+ret+"\n");
	}

}
