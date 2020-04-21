package com.org.cap.pan;

import java.util.Arrays;
import java.util.HashSet;

public class PangramFinderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "sentence";
		String [] strArray=str.split("");
		String alphabetsArray[]= "abcdefghijklmnopqrstuvwxyz".split("");
		findMissingLetters(strArray, alphabetsArray); 
	}
	public static void findMissingLetters(String[] strArray,String[] alphabetsArray ) {
		HashSet<String> str = new HashSet<String>(Arrays.asList(strArray));
        HashSet<String> str1 = new HashSet<String>(Arrays.asList(alphabetsArray));
        str1.removeAll(str);
        System.out.println(str1);
	}
}
