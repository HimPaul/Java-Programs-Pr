package JavaInterviewQuestion;

public class missingNumber {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,6,7,8,9};
		
		int n = arr.length+1;
		int totalsum = n*(n+1)/2;
			
	    int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		int n1 = totalsum-sum;
		System.out.println(n1);
	}
		
}

