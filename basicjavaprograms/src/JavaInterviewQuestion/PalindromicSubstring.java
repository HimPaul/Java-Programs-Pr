package JavaInterviewQuestion;


//https://www.youtube.com/watch?v=e9J3ntdvWyQ
import java.util.Collections;
import java.util.HashSet;

public class PalindromicSubstring {

	public static void isPalindrome(String str, int left, int right, HashSet<String> set) {

		while ((left >= 0 && right < str.length()) && (str.charAt(left) == str.charAt(right))) {

			set.add(str.substring(left, right + 1));
		
			left--;
			right++;
		}

	}

	public static void generateAllSubstring(String str) {

		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < str.length(); i++) {
			isPalindrome(str, i, i, set); // odd length palindrome
			isPalindrome(str, i, i + 1, set); // even length palindrome

		}
		
		System.out.println("palindromic substring are :"+set);
		
		//Longest palindromic substring or maximum length substring from string
		
		String result = set.toString();
		String word[] = result.split(",");
		String maxpalindrome = " ";
		for(int j=0;j<word.length;j++) {
			if(word[j].length() >= maxpalindrome.length()) {
				maxpalindrome = word[j];
			}
		}
		System.out.println("Longest palindromic substring is: "+maxpalindrome);
		System.out.println("Count of congest palindromic substring is :");
		System.out.println(maxpalindrome.length()-1);
	}
	public static void main(String[] args) {
		String s = "banana";
		generateAllSubstring(s);
		
	}

}
