package JavaInterviewQuestion;

//https://www.youtube.com/@codebots3754/videos
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		String s = "javaDev";
		for(int i=0;i<s.length();i++) {
			int count =0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count == 1) {
				System.out.println("first non repeating character is: "+s.charAt(i));
				break;
	    	}//if(count > 0) {
//				System.out.println("first repeating character is :"+s.charAt(i));
//			}
		}
	}
}
