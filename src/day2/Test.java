package day2;

public class Test {
	
	public static void main(String[] args) {
		System.out.println(warp(2147483647));
	}

	static long warp(int dist) {
		long n, minN, powN, maxN, warpCount = 0;
		for (n = 1;; n++) {
			
			powN = n * n;
			minN = powN - n + 1;
			maxN = powN + 1 + n -1;
			System.out.println(n);
			if(minN <= dist && dist <= maxN) {				
				if(minN <= dist && dist<=powN) {					
					warpCount = (n << 1) - 1;
				}else {					
					warpCount = n << 1;					
				}
				break;
			}

		}
		return warpCount;
	}
}
