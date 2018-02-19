package day1;

import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < num; i++) {
			sb.append("*");
			System.out.println(sb);
		}
	}

}
