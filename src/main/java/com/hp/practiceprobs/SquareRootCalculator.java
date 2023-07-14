package com.hp.practiceprobs;

public class SquareRootCalculator {

	public static void main(String[] args) {
		long x = 19786546;

		// Edge conditions
		// if x<0 then its a imaginary, sqrt cannot be calculated
		if (x <= 1 && x > 0) {
			System.out.println("Square root is: " + x);
		} else if (x <= 5) {
			System.out.println("Square root is: " + x / 2);
		} else {
			long prev = x / 2;
			long m = prev;
			while (m * m > x) {
				prev = m;
				m = m / 2;
			}

			while (prev > m) {
				prev = prev - 1;
				if (prev * prev <= x) {
					System.out.println("Square root is: " + prev);
					break;
				}
			}
		}
	}
}
