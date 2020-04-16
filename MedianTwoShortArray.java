package com.org.pn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MedianTwoShortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = { 2, 3, 6, 7, 9 };
		Integer arr1[] = { -1, 4, 8, 10, 11, 3 };
		Number result = 0;
		List<Integer> addList = Stream.concat(Arrays.asList(arr).stream(), Arrays.asList(arr1).stream()).sorted()
				.collect(Collectors.toList());
		int half = addList.size() / 2;
		if ((addList.size() % 2) == 0) {
			result = (addList.get(half).floatValue() + addList.get(half - 1).floatValue()) / 2;
		} else
			result = addList.get(half);
		System.out.println(result);

	}

}
