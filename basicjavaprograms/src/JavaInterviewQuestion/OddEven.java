package JavaInterviewQuestion;

public class OddEven {

	public static void main(String[] args) {
		
		int []arr = {4,6,1,9,5,2};
		System.out.println("Even Digits Are");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+"");
			}
		}
		System.out.println("Odd Digits Are");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 != 0) {
				System.out.println(arr[i]+"");
			}
		}
		
	}
}
