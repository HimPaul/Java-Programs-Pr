package basicjavaprograms;

public class CountVowelInString {

	public static void main(String[] args) {
		String s = "India";
		String str= s.toLowerCase();
		char[] st = str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				count++;
		}
		System.out.println(count);
		System.out.println();
		System.out.println();

	}
}
