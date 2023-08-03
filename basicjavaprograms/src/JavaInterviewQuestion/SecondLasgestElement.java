package JavaInterviewQuestion;

public class SecondLasgestElement {
	
	//2nd smallest and 2nd largest or can be any thing
	
	public static void main(String[] args) {
		
		int arr[] = {4,7,3,19,76,45,2};
		int size = arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i] > arr[j]) {
					if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		System.out.println("Sorted array");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		//System.out.println("\n2nd largest element is "+arr[size-2]);
		System.out.println("\n2nd smallest element is "+arr[size-2]);
	}
}
