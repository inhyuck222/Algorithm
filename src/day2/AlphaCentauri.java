package day2;

import java.util.Scanner;

public class AlphaCentauri {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int[] x = new int[testCase], y = new int[testCase];
		long[] result = new long[testCase];
		long sub;
		long before, after;

		for (int test = 0; test < testCase; test++) {
			x[test] = sc.nextInt();
			y[test] = sc.nextInt();
			sub = y[test] - x[test];
			before = 1;
			
			for (int i = 2;; i++) {
				after = before + i / 2;
				if (sub >= before && sub < after) {
					if(after > sub) {
						result[test] = i - 1;
						break;
					}
					result[test] = i;
					break;
				}
				before = after;
			}
		}

		for (int i = 0; i < testCase; i++) {
			System.out.println(result[i]);
		}
	}

}
