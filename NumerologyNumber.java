package com.org.nmn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumerologyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "S. KANAPATHY";
		String[] namesArray = null;
		namesArray = name.split("");
		getSumOfNumber(namesArray);
	}

	public static void getSumOfNumber(String[] name) {
		int sum = 0;
		for (String nameTemp : name) {
			int num = getNumber(nameTemp);
			sum = sum + num;
		}
		System.out.println(sum);
		System.out.println(countDigit(sum));
	}

	public static int getNumber(String name) {

		String[] one = { "A", "I", "J", "Q", "Y" };
		String[] two = { "B", "K", "R" };
		String[] three = { "C", "G", "L", "S" };
		String[] four = { "D", "M", "T" };
		String[] five = { "E", "H", "N", "X" };
		String[] six = { "U", "V", "W" };
		String[] seven = { "O", "Z" };
		String[] eight = { "F", "P" };

		if (Arrays.stream(one).anyMatch(name::equalsIgnoreCase)) {
			return 1;
		} else if (Arrays.stream(two).anyMatch(name::equalsIgnoreCase)) {
			return 2;
		} else if (Arrays.stream(three).anyMatch(name::equalsIgnoreCase)) {
			return 3;
		} else if (Arrays.stream(four).anyMatch(name::equalsIgnoreCase)) {
			return 4;
		} else if (Arrays.stream(five).anyMatch(name::equalsIgnoreCase)) {
			return 5;
		} else if (Arrays.stream(six).anyMatch(name::equalsIgnoreCase)) {
			return 6;
		} else if (Arrays.stream(seven).anyMatch(name::equalsIgnoreCase)) {
			return 7;
		} else if (Arrays.stream(eight).anyMatch(name::equalsIgnoreCase)) {
			return 8;
		}
		return 0;
	}

	static int countDigit(int n) {
		int sum = 0;
		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}
}
