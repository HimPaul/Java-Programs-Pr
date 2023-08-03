package basicjavaprograms;

import java.util.HashSet;
import java.util.Set;

//Length of longest substring without repeating characters 
public class LongestSubstring {
	public static int lengthofsubstring(String s) {
		Set<Character> set = new HashSet<Character>();
		int max =0;
		int left =0;
		for(int right =0;right < s.length();right++) {
			char ch = s.charAt(right);
			while(set.contains(ch)) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(ch);
			int len = right - left +1;
			max = Math.max(max, len);
			
		}
		return max;
		
	}
	public static void main(String[] args) {
		String s = "abcaabcbb";
		int max = lengthofsubstring(s);
		System.out.println("The lenght of substring is: "+max);
		
		
	}
}
