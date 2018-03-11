package leetcode.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionServiceImpl implements SolutionService {

	public int lengthOfLongestSubstring(String s) {
		
		MyQueueQ3 myQueue = new MyQueueQ3();
		
		char ch = '\0';
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
//			System.out.println(ch);
			myQueue.takeQueue(ch);
			myQueue.put(ch);
//			myQueue.printList();
		}
		System.out.println("lenMaxHistory:"+myQueue.getLenMaxHistory());
		return myQueue.getLenMaxHistory();
	}
	
	
	public String longestPalindrome(String s) {
		
		if (s.length() <= 1) {
			return s;
		}
		
		String longest = new String();
		
		for (int i = 0, j = s.length()-1; i <= j; i++, j--) {
			if(isPalindromic(i,j,s) && longest.length() < (j-i+1)) {
				longest = s.substring(i, j+1);
			}
			for (int w = i+1; w < j; w++) {
				if(isPalindromic(w,j,s) && longest.length() < (j-w+1)) {
					longest = s.substring(w, j+1);
				}
				if (longest.length() > j-w+1) {
					break;
				}
			}
			for (int w = j-1; i < w; w--) {
				if(isPalindromic(i,w,s) && longest.length() < (w-i+1)) {
					longest = s.substring(i, w+1);
				}
				if (longest.length() > w-i) {
					break;
				}
			}
			if (longest.length() > j-i+1) {
				break;
			}
			System.out.println("longest:"+longest+", ("+i+","+j+")");
		}
		
		return longest;
	}
	
	private boolean isPalindromic(int head, int tail, String s) {
//		System.out.println("head:"+head+", tail:"+tail);
		boolean ret = true;
		for (int i = head, j = tail; i <= j; i++, j--) {
//			System.out.println("i:"+i+", j:"+j+"--"+s.charAt(i)+", "+s.charAt(j));
			if(s.charAt(i) != s.charAt(j)) {
				ret = false;
				break;
			}
		}
//		System.out.println("sub:"+s.substring(head, tail+1)+", "+ret);
		return ret;
	}
	
	
	public int myAtoi(String str) {
		
		int flag = 1;
		int flagCount = 0;
		int ret = 0;
		char wei = '\0';
		int tmp = 0;
		for(int i = 0; i < str.length(); i++) {
			wei = str.charAt(i);
			if ('\0' == wei || ' ' == wei) {
				if (ret > 0 || flagCount > 0) {
					System.out.println("[warning] not number 2..."+str);
					return ret*flag;
				}
				continue;
			} else if (ret == 0 && '0' == wei) {
				continue;
			} else if ('+' == wei) {
				if (flagCount > 0) {
					System.out.println("[warning] flag more..."+str);
					return 0;
				}
				flagCount++;
				continue;
			} else if ('-' == wei) {
				if (flagCount > 0) {
					System.out.println("[warning] flag more..."+str);
					return 0;
				}
				flag = -1;
				flagCount++;
			} else if ('0' <= wei && '9' >= wei) {
				tmp = Character.getNumericValue(wei);
				if ((Integer.MAX_VALUE-tmp) / 10 < ret) {
					if (flag == 1) {
						System.out.println("[warning] bigger than "+Integer.MAX_VALUE+"..."+str);
						return Integer.MAX_VALUE;
					} else if (flag == -1) {
						System.out.println("[warning] smaller than "+Integer.MIN_VALUE+"..."+str);
						return Integer.MIN_VALUE;
					}
				}
				ret = ret*10 + tmp;
				
			} else {
				System.out.println("[warning] not number..."+str);
				return ret*flag;
			}
//			System.out.println("wei: "+wei+", flag: "+flag+", ret: "+ret+"\n--------------------------");
		}
		
		return ret*flag;
	}
	
	
	public String longestCommonPrefix(String[] strs) {
		
		String ret = new String();
		int len = getShortestStr(strs);
		for(int i = 0; i < len; i++) {
			boolean pass = true;
			for(int j = 1; j < strs.length; j++) {
				System.out.println(strs[j-1].charAt(i)+": "+strs[j].charAt(i));
				if (strs[j-1].charAt(i) != strs[j].charAt(i)) {
					pass = false;
					break;
				}
			}
			System.out.println("-----------------");
			if (pass) {
				ret = strs[0].substring(0, i+1);
			} else {
				break;
			}
			System.out.println("ret: "+ret);
		}
		
		System.out.println("[ret]: "+ret);
		
		return ret;
	}
	
	private int getShortestStr(String[] strs) {
		if (strs.length == 0) {
			return 0;
		}
		int lenMin = strs[0].length();
		for(int i = 0; i < strs.length; i++) {
			if (lenMin > strs[i].length()) {
				lenMin = strs[i].length();
			}
		}
		return lenMin;
	}
	
	
	public boolean isValid(String s) {
		
		MyStackQ20 stack = new MyStackQ20();
		
//		System.out.println("s: "+s);
		
		if (s.length() == 0) {
			return true;
		} else if (s.length() % 2 != 0) {
			return false;
		}
		
		stack.push(s.substring(0, 1));
		
		for(int i = 1; i < s.length(); i++) {
//			System.out.println("sub: "+s.substring(i, i+1)+", top: "+stack.getTop());
			if (isPair(s.substring(i, i+1), stack.getTop())) {
				stack.pop();
			} else {
				stack.push(s.substring(i, i+1));
			}
		}

//		System.out.println("---------------------------------");
		
		return stack.isEmpty();
	}
	
	private boolean isPair(String s1, String s2) {
//		System.out.println("s1: "+s1+", s2: "+s2);
		if (s1 == null || s2 == null) {
			return false;
		}
		if (s1.equals(")")) {
			if (s2.equals("(")) {
//				System.out.println("() pair...");
				return true;
			}
		} else if (s1.equals("]")) {
			if (s2.equals("[")) {
//				System.out.println("[] pair...");
				return true;
			}
		} else if (s1.equals("}")) {
			if (s2.equals("{")) {
//				System.out.println("{} pair...");
				return true;
			}
		}
//		System.out.println("not pair...");
		return false;
	}
	
	
	public int strStr(String haystack, String needle) {
		if (haystack.length() == 0) {
			if (needle.length() == 0) {
				return 0;
			} else {
				return -1;
			}
		}
		if (haystack.length() < needle.length()) {
			return -1;
		}
		
		
		for (int i = 0; i <= (haystack.length()-needle.length()); i++) {
			if (haystack.length() - i < needle.length()) {
				return -1;
			}
			if (isNeedle(haystack, needle, i)) {
				return i;
			}
		}
		
		return -1;
	}
	
	private boolean isNeedle(String haystack, String needle, int start) {
		System.out.println("isNeedle, haystack:"+haystack+", needle:"+needle+", start:"+start);
		for (int i = 0; i < needle.length(); i++) {
			System.out.println("haystack.i:"+haystack.charAt(start+i)+", needle.i:"+needle.charAt(i));
			if (start+i >= haystack.length()) {
				System.out.println("return false1");
				return false;
			}
			if (haystack.charAt(start+i) != needle.charAt(i)) {
				System.out.println("return false2");
				return false;
			}
		}
		System.out.println("return true");
		return true;
	}
	
	
	public int lengthOfLastWord(String s) {
		int length = 0;
		
		if (s.length() == 0) {
			return 0;
		}
		
		boolean hasWord = false;
		for (int i = s.length()-1; i >= 0; i--) {
			if ((!hasWord) && (s.charAt(i) != ' ')) {
				hasWord = true;
				length++;
			} else if ((hasWord) && (s.charAt(i) == ' ')) {
				break;
			} else if ((!hasWord) && (s.charAt(i) == ' ')) {
				continue;
			} else if ((hasWord) && (s.charAt(i) != ' ')) {
				length++;
			}
		}
		
		return length;
	}
	
	
	public String addBinary(String a, String b) {
		List<String>retStr = new ArrayList<String>();
		int posA = a.length()-1;
		int posB = b.length()-1;
		Integer c = 0;
		while(posA >= 0 && posB >= 0) {
			Integer temp = Integer.valueOf(a.charAt(posA)) - '0' + Integer.valueOf(b.charAt(posB)) - '0' + c;
			c = temp / 2;
			retStr.add(String.valueOf(temp % 2));
			System.out.println("1. a["+posA+"]="+a.charAt(posA)+", b["+posB+"]="+b.charAt(posB)+", ret.last="+retStr.get(retStr.size()-1)+", c="+c);
			posA--;
			posB--;
		}
		while(posA >= 0) {
			Integer temp = Integer.valueOf(a.charAt(posA)) - '0' + c;
			c = temp / 2;
			retStr.add(String.valueOf(temp % 2));
			System.out.println("1. a["+posA+"]="+a.charAt(posA)+", ret.last="+retStr.get(retStr.size()-1)+", c="+c);
			posA--;
		}
		while(posB >= 0) {
			Integer temp = Integer.valueOf(b.charAt(posB)) - '0' + c;
			c = temp / 2;
			retStr.add(String.valueOf(temp % 2));
			System.out.println("1. b["+posB+"]="+b.charAt(posB)+", ret.last="+retStr.get(retStr.size()-1)+", c="+c);
			posB--;
		}
		if (c > 0) {
			retStr.add(String.valueOf(c));
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
		Collections.reverse(retStr);
		System.out.println("r="+retStr);
		System.out.println("r="+String.join("", retStr));
		
		return new String(String.join("", retStr));
	}
	
	
	public boolean isPalindrome(String s) {
		
		if ((s.length() == 0) || (s.length() == 1)) {
			return true;
		}
		
		int i = 0;
		int j = s.length()-1;
		while (i <= j) {
			System.out.println("i:"+i+", s[i]:"+s.charAt(i)+", j:"+j+", s[j]:"+s.charAt(j));
			if((s.charAt(i) < 48) || ((s.charAt(i) > 57) && (s.charAt(i) < 65)) || (s.charAt(i) > 122) || ((s.charAt(i) > 90)&&(s.charAt(i) < 97))) {
				System.out.println("i++");
				i++;
				continue;
			}
			if((s.charAt(j) < 48) || ((s.charAt(j) > 57) && (s.charAt(j) < 65)) || (s.charAt(j) > 122) || ((s.charAt(j) > 90)&&(s.charAt(j) < 97))) {
				System.out.println("j++");
				j--;
				continue;
			}
			if(((s.charAt(i) >= 48) && (s.charAt(i) <= 57)) && ((s.charAt(j) >= 48) && (s.charAt(j) <= 57)) && (s.charAt(i) == s.charAt(j))) {
				System.out.println("111111");
				i++;
				j--;
			} else if ((((s.charAt(i) >= 65) && (s.charAt(i) <= 90)) || ((s.charAt(i) >= 97) && (s.charAt(i) <= 122))) && (((s.charAt(j) >= 65) && (s.charAt(j) <= 90)) || ((s.charAt(j) >= 97) && (s.charAt(j) <= 122)))) {
				System.out.println("222222");
				if ((s.charAt(i) == s.charAt(j)) || (s.charAt(i) == s.charAt(j)+32) || (s.charAt(i)+32 == s.charAt(j))) {
					System.out.println("333333");
					i++;
					j--;
				} else {
					System.out.println("neq");
					return false;
				}
			} else {
				System.out.println("neq");
				return false;
			}
		}
		
		return true;
	}
	
}
