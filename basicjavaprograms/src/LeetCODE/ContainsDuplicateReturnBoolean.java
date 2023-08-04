package LeetCODE;

import java.util.Arrays;
import java.util.Scanner;

public class ContainsDuplicateReturnBoolean {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,5,7,9};
		
		Arrays.sort(nums);
		
		boolean flag = false;
		
		for(int i=0;i<nums.length-1;i++) {
			
			if(nums[i] == nums[i+1] ) {
				
				flag = true;
				
			}
		}
		if(flag == true) {
			
			System.out.println(flag);
			
			
		}else {
			
			System.out.println(flag);
		}
	}
}
