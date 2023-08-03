package JavaInterviewQuestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//https://www.youtube.com/watch?v=sqxer2ynS6U

public class DistinctCharcterInString {

	public static void main(String[] args) {
			
		
		String str = "abcdab";
		System.out.println(longest(str));
		
	}

	private static String longest(String str) {
		HashSet<Character> set = new HashSet<Character>();
		String longestoverall ="";
		String longesttillnow = "";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(set.contains(c)) {
				longesttillnow = "";
				set.clear();
			}
			set.add(c);
			longesttillnow = longesttillnow + c;
			if(longesttillnow.length() > longestoverall.length()) {
				longestoverall = longesttillnow;
			}
		}
		return longestoverall;	
	}
}
