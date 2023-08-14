package LeetCODE;

public class ProductOfArrayExceptSelf__2 {
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		  int[] prefix = new int[nums.length];
	        int[] suffix = new int[nums.length];
	        int[] answer = new int[nums.length];
	        suffix[nums.length-1]=1;
	        prefix[0]=1;
	        for(int i=nums.length-2;i>=0;i--)
	        {
	            suffix[i]=suffix[i+1]*nums[i+1];
	        }
	        for(int i=1;i<nums.length;i++)
	        {
	            prefix[i]=prefix[i-1]*nums[i-1];
	        }
	        for(int i=0;i<nums.length;i++)
	        {
	            answer[i]=prefix[i]*suffix[i];
	            
	            System.out.println(answer[i]);
	        }
	        
	    }
	}


