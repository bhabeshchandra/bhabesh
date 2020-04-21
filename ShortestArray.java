package com.org.sa;

import java.util.ArrayList;
import java.util.List;

public class ShortestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 0, 2, 7 }, { 4, 12 }, { 1, 2, 5, 6 } };
		int shortInd = 0;
		List<String> result = new ArrayList<String>();
		for (int i = 1; i < arr.length; i++) {
			if (arr[shortInd].length > arr[i].length)
				shortInd = i;
		}
		int length = arr[shortInd].length;
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < length; j++) {
				result.add(arr[shortInd][j] + " ");
			}
		}
		System.out.println("Shortest Array: " + result);
		System.out.println("Length :" + length);
	}

}
