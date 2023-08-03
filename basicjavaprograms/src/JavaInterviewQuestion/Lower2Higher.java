package JavaInterviewQuestion;

import java.util.Scanner;

public class Lower2Higher {

	public static void main(String[] args) {
		
		System.out.println("Enter your string");
		Scanner sc = new Scanner(System.in);
	    String s1 = sc.nextLine();
	    String s = s1.replaceAll(" ","");
	    System.out.println(s);
	    for(int i=0;i<s.length();i++) {
	    	char ch = s.charAt(i);
	    	if(ch > 64 && ch < 91) {
	    		ch =(char) (ch + 32);
	    		System.out.println((char)ch);
	    	}else if(ch > 96 && ch < 123) {
	    		ch = (char)(ch-32);
	    		System.out.println((char)ch);
	    	}if(ch == 32) {
	    		System.out.println(" ");
	    	}
	    }
	}
}
