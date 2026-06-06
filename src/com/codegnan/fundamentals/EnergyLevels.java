package com.codegnan.fundamentals;

import java.util.Scanner;

public class EnergyLevels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			// Read starting item ID
			int S = scanner.nextInt();
			// Read number of non-defective items to process
			int N = scanner.nextInt();
			// Read defective condition divisor
			int K = scanner.nextInt();
			// Read safety limit
			int M = scanner.nextInt();
			int totalSum = 0;
			int processedCount = 0;
			for (int i = S; processedCount < N; i++) {
				if (i % K == 0) {
					continue;
				}
				totalSum += i;
				processedCount++;
				if (totalSum >= M) {
					break;
				}
			}
			System.out.println(totalSum);
		}
		scanner.close();
	}

}
