package org.cap.ps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class PrimeString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "11373";
		PrimeString2.subString(str);
	}

	@SuppressWarnings("unchecked")
	static void subString(String str) {
		int splits[]=null;
		Set<Integer> st = new HashSet<Integer>();
		List<Integer> lst = new ArrayList<Integer>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				//System.out.println(str.substring(i, j));
				st.add(Integer.parseInt(str.substring(i, j)));
			}
		}
		System.out.println(st);
		for(Integer num: st){
            if(isprime(num)){
               // System.out.println(num);
                lst.add(num);
            }
        }
		  System.out.println(lst);
		  final int chunkSize = 3;
		  final AtomicInteger counter = new AtomicInteger();
		  final Collection<List<Integer>> result = lst.stream()
		      .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / chunkSize))
		      .values();
		  System.out.println(result);
		  
		  
	}

	private static boolean isprime(int num) {
		if (num == 0 || num == 1) {
			return false;
		} else {
			for (int x = 2; x < (int) Math.sqrt(num); x++)
				if (num % x == 0)
					return false;
		}
		return true;
	}
}
