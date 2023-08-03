package JavaInterviewQuestion;

public class DuplicateCharacterStrings {

	public static void main(String[] args) {
		
		String s = "TestingAutomation";
		int count =0;
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("duplicate characters are: "+ch[j]);
					count++;
				}
			}
		}
		System.out.println("duplicate character count "+count);
	}

}
