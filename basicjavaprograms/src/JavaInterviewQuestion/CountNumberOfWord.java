package JavaInterviewQuestion;

import java.util.Scanner;

public class CountNumberOfWord {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String s[] = str.split(" ");
		
		int count = 1;
		
		for(int i=0;i<str.length()-1;i++) {
			
			if((str.charAt(i)==' ') && (str.charAt(i+1)!= ' ')) {
				
				count++;
			}
		  }
		System.out.println("Number of words in string "+count);
		}
	
}
