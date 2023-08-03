package JavaInterviewQuestion;

public class NumberAdditionInString {

	public static void main(String[] args) {
		
		String s = "afaha618181ss";
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println(sum);
	}
}
