package basicjavaprograms;

import java.util.LinkedHashSet;

public class CountVowelsandRemoveDuplicates {

	public static void main(String[] args) {
		
		String str = "India";
		str = str.toLowerCase();
		//char[] str1 = str.toCharArray();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			//if (str1[i] == 'a' || str1[i] == 'e' || str1[i] == 'i' || str1[i] == 'o' || str1[i] == 'u') {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i)== 'o' || str.charAt(i) == 'u') {
				count++;

			}

		}
		System.out.println("Total number of vowels:" + count);

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++)

		{
			set.add(str.charAt(i));
			System.out.println(set);
		}

	}
}
