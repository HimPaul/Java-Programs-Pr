package basicjavaprograms;

public class FirstUniqueCharacter {
	
	public static int firstcharcter(String s) {
		
		int[] freq = new int[26];
		char[] ch = s.toCharArray();
		for(char c : ch) {
			freq[c-'a']++;
		}
		for(int i=0;i<ch.length;i++) {
			if(freq[ch[i]-'a']== 1) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		
		System.out.println(firstcharcter("loveleetcode"));
	}

}
