package basicjavaprograms;

public class ValidPalindrome {

	static boolean isPaindrome(String s) {
		s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		int i=0;
		int j = s.length()-1;
		while(i<=j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		System.out.println(isPaindrome("A man, a plan, a canal: Panama"));
	}
}
