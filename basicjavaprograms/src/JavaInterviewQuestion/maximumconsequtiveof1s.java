package JavaInterviewQuestion;

public class maximumconsequtiveof1s {
	
	//Consecutive 1s in an array
	
	public static int findmaxconsequtive1(int[] num) {
		
		int count =0 , res =0;
		for(int i: num) {
			if(i==0) {
				count = 0;
			}else {
				count ++;
				res = Math.max(res,count);
			}
		}
		return res;
		
	}

	public static void main(String[] args) {
		
		int[] num = {1,1,0,1,0,0,1,1,1};
		System.out.println(findmaxconsequtive1(num));
	}
}
