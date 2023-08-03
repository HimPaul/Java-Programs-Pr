package JavaInterviewQuestion;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//https://www.youtube.com/watch?v=jbGxTi0bi7c

public class CountCharacterInString {

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
	}
}
