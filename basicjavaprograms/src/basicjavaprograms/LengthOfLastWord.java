package basicjavaprograms;

//count the last word in string
public class LengthOfLastWord {
	
	public static int lengthlastword(String s) {
		String str = s.trim();
		int count = 0;
		for(int i=str.length()-1;i>=0;i--) {
			if(s.charAt(i)!= ' ') {
				count++;
			}else {
				break;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		String str = "i am himadri";
		int j = lengthlastword(str);
		System.out.println("Length of last word: "+j);
		
	}
}
