package JavaInterviewQuestion;

public class PrintSubstringAndCountCharacter {
	
	public static void main(String[] args) {
		
		int count =0;
		String name = "banana";
		String nam[] = name.split("");
		for(int i=0;i<nam.length;i++) {
			String str = "";
			for(int j=i;j<nam.length;j++) {
				str = str + nam[j];
				count++;
				System.out.println(str);
				
		}
  	
	}
		System.out.println("------");
		System.out.println("and the count of substring is :"+count);

	}
}
