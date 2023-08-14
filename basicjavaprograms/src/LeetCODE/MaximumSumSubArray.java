package LeetCODE;


//Kadane's Algorithm

public class MaximumSumSubArray {
	
	int maxSubArray(int a[]) {
		int maxsum = 0;
		int currsum = 0;
		for(int i=0;i<a.length-1;i++) {
			currsum = currsum + a[i];
			if(currsum > maxsum) {
				maxsum = currsum;
			}
			if(currsum < 0) {
				currsum = 0;
			}
		}
		return maxsum;		
	}

	public static void main(String[] args) {
		
		int a[] = {-2,1,-3,4,-1,2,1,-5,4};
		MaximumSumSubArray obj = new MaximumSumSubArray();
		int max = obj.maxSubArray(a);
		System.out.println(max);
		
	}
}
