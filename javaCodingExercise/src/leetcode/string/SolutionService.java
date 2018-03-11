package leetcode.string;

public interface SolutionService {

	//3.Longest Substring Without Repeating Characters
	public int lengthOfLongestSubstring(String s);
	
	//5.Longest Palindromic Substring
	public String longestPalindrome(String s);
	
	//8.String to Integer (atoi)
	public int myAtoi(String str);
	
	//14.Longest Common Prefix
	public String longestCommonPrefix(String[] strs);
	
	//20.Valid Parentheses
	public boolean isValid(String s);
	
	//28.Implement strStr()
	public int strStr(String haystack, String needle);
	
	//58.Length of Last Word
	public int lengthOfLastWord(String s);
	
	//67.Add Binary
	public String addBinary(String a, String b);
	
	//125.Valid Palindrome
	public boolean isPalindrome(String s);
	
}
