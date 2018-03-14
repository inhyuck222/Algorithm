package day1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, row = 1, parent, child;

		num = sc.nextInt();

		while (num - row > 0) {
			num -= row;
			row++;
		}
		
		if(row % 2 == 0) {
			parent = 1;
			child = row;
		}else {
			parent = row;
			child = 1;
		}

		for (int i = 1; i < num; i++) {
			if(row % 2 == 0) {
				parent++;
				child--;
			}else {
				parent--;
				child++;
			}
		}
		
		System.out.println(parent + "/" + child);

	}

}
