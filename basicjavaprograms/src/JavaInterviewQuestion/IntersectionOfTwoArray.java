package JavaInterviewQuestion;

import java.util.HashSet;

public class IntersectionOfTwoArray {
	
	public static void printIntersection(int[] arr1,int[] arr2) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i =0;i<arr1.length;i++) {
			hs.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			if(hs.contains(arr2[i])) {
				System.out.println(arr2[i]);
			}
		}
	}

	public static void main(String[] args) {
	
		int arr1[] = {2,4,5,7,8,10};
		int arr2[] = {6,8,1,10,3};
		printIntersection(arr1, arr2);
	}

}
