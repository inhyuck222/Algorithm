package day1;

import java.util.Scanner;

public class Year2007 {
	Scanner sc;
	int month, day;

	public void solve() {
		int tempDay = 0;
		int sum = 0;
		int dayOfTheWeek;

		sc = new Scanner(System.in);
		month = sc.nextInt();
		day = sc.nextInt();

		for (int m = 1; m <= 13; m++) {
			if (m == 2) {
				tempDay = 28;
			} else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
				tempDay = 31;
			} else {
				tempDay = 30;
			}
			
			if (m == month) {
				break;
			}
			
			sum += tempDay;
		}
		
		sum += day;
		dayOfTheWeek = sum % 7;
		
		switch (dayOfTheWeek) {
		case 0: System.out.println("SUN");break;
		case 1: System.out.println("MON");break;
		case 2: System.out.println("TUE");break;
		case 3: System.out.println("WED");break;
		case 4: System.out.println("THU");break;
		case 5: System.out.println("FRI");break;
		case 6: System.out.println("SAT");break;
		}
	}

	public static void main(String[] args) {
		Year2007 m = new Year2007();
		m.solve();
	}

}