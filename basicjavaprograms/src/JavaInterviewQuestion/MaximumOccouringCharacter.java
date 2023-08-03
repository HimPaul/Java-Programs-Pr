package JavaInterviewQuestion;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MaximumOccouringCharacter {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s = s1.replaceAll(" ", "");
		char[] str = s.toCharArray();
		int count =0;
		Map<Character,Integer> map = new TreeMap<Character,Integer>();
		for(int i=0;i<str.length;i++) {
			count =0;
			for(int j = 0;j<str.length;j++) {
				if(str[i]==str[j]) {
					count++;
				}
			}
			map.put(str[i], count);
		}
		System.out.println(map);
		
		 Map.Entry<Character, Integer> maxEntry =
	                Collections.max(map.entrySet(), Map.Entry.comparingByValue());
	 
	        System.out.println("maximum character "+ maxEntry);
	}

}

