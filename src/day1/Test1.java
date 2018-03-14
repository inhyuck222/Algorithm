package day1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sixNine = 0, max = 0;
		int[] numbers = new int[10];
		char[] inputValues = sc.nextLine().toCharArray();
		int[] values = new int[inputValues.length];

		for (int i = 0; i < values.length; i++) {
			values[i] = inputValues[i] - '0';
			if (values[i] == 6 || values[i] == 9) {
				sixNine++;
				continue;
			}
			numbers[values[i]]++;
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		if(sixNine % 2 != 0) {
			sixNine++;
		}
		
		sixNine = sixNine / 2;

		if(max > sixNine) {
			System.out.println(max);
		} else {
			System.out.println(sixNine);
		}

	}

}
