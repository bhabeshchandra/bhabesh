package org.cap.psycho;

import java.util.Scanner;

public class Psychometrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int getVal = scan.nextInt();
		int[] scores = new int[getVal];
		for (int i = 0; i < getVal; i++) {
			scores[i] = scan.nextInt();
		}
		
		int x = scan.nextInt();
		int[] lowerLimit = new int[x];
		for (int i = 0; i < x; i++) {
			lowerLimit[i] = scan.nextInt();
		}
		
		int y = scan.nextInt();
		int[] upperLimit = new int[y];
		for (int i = 0; i < y; i++) {
			upperLimit[i] = scan.nextInt();
		}
		
		int candidates[] = new int[upperLimit.length];
		for (int i = 0; i < lowerLimit.length; i++) {
			candidates[i] = jobOffers(scores, getVal, lowerLimit[i], upperLimit[i]);
		}
		
		for (int candidate : candidates)
			System.out.println(candidate);
	}

	static int jobOffers(int arr[], int noCandidate, int lowerLimit, int upperLimit) {
		int count = 0;
		for (int i = 0; i < noCandidate; i++) {

			if (arr[i] >= lowerLimit && arr[i] <= upperLimit)
				count++;
		}
		return count;
	}

}
