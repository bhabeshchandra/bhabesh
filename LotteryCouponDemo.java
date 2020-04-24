package com.org.lc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class LotteryCouponDemo {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			int coupon = scan.nextInt();
			Map<Integer, Integer> sumMap = new HashMap<>();
			for (int i = 1; i <= coupon; i++) {
				int couponSum = getCouponSum(i);
				if (sumMap.containsKey(couponSum)) {
					sumMap.put(couponSum,(new Integer(sumMap.get(couponSum)).intValue() + 1));
				} else {
					sumMap.put(couponSum, new Integer(1));
				}
			}
			int count = 0;
			int maxVal = (Collections.max(sumMap.values()));
			for (Entry<Integer, Integer> entry : sumMap.entrySet()) {
				if (entry.getValue() == maxVal) {
					count++;
				}
			}
			System.out.println(count);
		}

		private static int getCouponSum(int coupan) {
			int sum = 0;
			while (coupan != 0) {
				sum = sum + coupan % 10;
				coupan = coupan / 10;
			}
			return sum;
		}

	 
	 

		     
}
