package JavaInterviewQuestion;

public class PairsOfElementsTarget {
	
	public static int[] printpair(int target,int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
				  System.out.println(arr[i]+","+arr[j]);	
				}
			}
		}
		return null;
		
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,9,4,7,6,5};
		int target =10;
		printpair(target, arr);
	}

}
