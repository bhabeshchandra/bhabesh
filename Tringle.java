package com.org.tranle;

public class Tringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GetPasVal(5, 3));
	}

	public static long GetPasVal(int row, int col) {
		int factOfRow = 1, i;
		for (i = 1; i <= (row - 1); i++)
			factOfRow *= i;
		int factOfRowMinusCol = 1;
		for (i = 1; i <= (row - 1) - (col - 1); i++)
			factOfRowMinusCol *= i;
		int factOfCol = 1;
		for (i = 1; i <= (col - 1); i++)
			factOfCol *= i;
		int fact = factOfRow / (factOfCol * factOfRowMinusCol);
		return fact;
	}
}
