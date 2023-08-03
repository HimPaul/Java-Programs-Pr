package basicjavaprograms;

import java.util.Scanner;

public class FactorialNumber {
	
	public static void fact() {
		int g = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			g = g*i;
		}
		System.out.println(g);
	}
	public static void main(String[] args) {
		FactorialNumber.fact();		
	   }
		
	}
	
