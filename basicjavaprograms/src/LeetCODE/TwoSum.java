package LeetCODE;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
	
	public int[] twoSum(int[] nums,int target) {
		
		//Map<Integer,Integer> newMap = new HashMap<Integer,Integer>(); 
		Map<Integer,List<Integer>> newMap = new HashMap<Integer,List<Integer>>();
		//in case of duplicate numbers
		
		  Map<Integer,Integer> map = new HashMap<>(); 
	        for(int i =0; i< nums.length; i++) {
	           map.put(nums[i],i); //putting first value in map 
	        }
	        for(int i=0;i<nums.length;i++) {
	        	int num = nums[i];
	        	int remaining = target - num;
	        	if(map.containsKey(remaining)) {
	        		int index = map.get(remaining);
	        		if(index == i) continue; //for map not to consider the first index again
	        		return new int[] {i,index};
	        	}
	        }
	        return new int[] {-1};
	}

	public static void main(String[] args) {
		
		int[] nums = {2, 2, 7, 11, 15};
		int target = 4;
		TwoSum two = new TwoSum();
		int[] num = two.twoSum(nums, target);
		for(int j=0;j<num.length;j++) {
			System.out.println(num[j]);
		}
		
		
	}

}
