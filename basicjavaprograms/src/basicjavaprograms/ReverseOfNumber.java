package basicjavaprograms;

public class ReverseOfNumber {

	public static void main(String[] args) {
		
		int r = 0;
		int t = 0;
		int n = 121;
		int sum = 0;
		int temp = n;
		while(n!=0) {
			
			r = n%10;
			t = t * 10 + r;
			n = n/10;
			sum = sum + r;
		}
		System.out.println(t);
		System.out.println("sum of number: "+sum);
		if(temp == t) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}

}
