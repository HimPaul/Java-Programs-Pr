package JavaInterviewQuestion;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		String arr[] = {"java","sfdc","c","javascript","java","sfdc"};
		
		HashSet<String> lang = new HashSet<String>();
		for(String l : arr) {
			if(lang.add(l) == false) {
				System.out.println("the duplicate elements are "+l);
			}
		}
		
		
		/*for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					
					System.out.println(""+arr[i]);
				}
			}
		}*/
		
		
	}
}
