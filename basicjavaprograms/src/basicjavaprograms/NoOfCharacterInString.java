package basicjavaprograms;

//Count Characters in String

public class NoOfCharacterInString {

	public static void main(String[] args) {
		String s = "Himadri paul";
		int count =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!= ' ' ) {
				count++;
			}
		}
		System.out.println("no of character in given string is :"+count);
	}
}
