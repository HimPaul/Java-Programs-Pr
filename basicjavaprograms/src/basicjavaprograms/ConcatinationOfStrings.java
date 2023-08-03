  package basicjavaprograms;

public class ConcatinationOfStrings {

	public static void main(String[] args) {
		String s1="hi";
		String s2="hello";
		String s3="bye";
		System.out.println(s1.concat(s2).concat(s3));
		
		String s4="hi";
		String s5="hello";
		String s6="bye";
		String joined=String.join(" ", s4,s5,s6);
		System.out.println(joined);
		
		String s7="hi hello Welcome";
		System.out.println(s7.contains("hello"));
		
		String s8="hi hello Welcome";
		System.out.println(s8.startsWith("hi"));
		
		String s9="hi hello Welcome";
		System.out.println(s9.endsWith("Welcome"));
		
		String s10="hello";
		String s11=" ";
		System.out.println(s11.isBlank());

		String s12="hello";
		String s13="";
		System.out.println(s13.isEmpty());
		
		String s14="Welcome";
		System.out.println(s14.replace('W', 'w'));
		
		String s15="hi hello welcome";
		System.out.println(s15.trim());
		
		String s16="Welcome";
    	System.out.println(s16.substring(1,3));
    	
    	String st1="hi hello Welcome";
    	String[] s17= st1.split(" ");
    	for(int i=0;i<s17.length;i++)
    	{
    		System.out.println(s17[i]);
    	}
    	
    	String st2="hi hello Welcome";
    	System.out.println(st2.replace(" "," "));
  	
    	String s18="hi";
    	String s19="hi";
    	System.out.println(s18.equals(s19));
    	
    	
	}
	}
