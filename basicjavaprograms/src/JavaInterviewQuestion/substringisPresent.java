package JavaInterviewQuestion;


//subsequence order of character should me maintain may or may not be contigues

public class substringisPresent {
	
	public static boolean  isSubsequence() {
		String str1 = "abc";
		String str2 = "adhdhbdkdc";
		
		int i=0;
		int j=0;
		
		while(i < str1.length() && j< str2.length()) {
			
			if(str1.charAt(i) == str2.charAt(j)) {
				i++;
			}
			if(str1.length() == i) {
				return true;
			}
			j++;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(isSubsequence());
	}

}
