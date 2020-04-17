package org.cap.ps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrimeStringDemo().getPrimeString("11373").forEach(str->System.out.println(str));
	}
	private  List<String> getPrimeString(String string) {

		if(string.length()==1) {
			List<String> li = new ArrayList<String>();
			li.add(string);
			return li;
			}
		else if (string.length()==2) {
			List<String> li = new ArrayList<String>();
			li.add(string);
			li.add(string.charAt(0)+","+string.charAt(1));
			return li;
		}
		else {
			List<String> finalList=new ArrayList<>();
			finalList.add(string);
			for(int i=2;i<string.length();i++) {
				List<String> l1=getPrimeString(string.substring(0, i));
				List<String> l2=getPrimeString(string.substring(i));			
				l1.forEach(str ->{
					l2.forEach(str2->{
						finalList.add(str+","+str2);
					});
				});
			}
			return finalList.stream().distinct().collect(Collectors.toList());
		}
	}

}
