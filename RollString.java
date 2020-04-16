package org.cap.ps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RollString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abz"; 
       // int k[] = {3, 2, 1}; 
        List<Integer> k =new ArrayList<Integer>();
        k.add(3);
        k.add(2);
        k.add(1);
        System.out.println(roll(s, k)); 
	}
	public static String roll(String toRoll, List<Integer> K) { 
		int roll[]= K.stream().mapToInt(i->i).toArray();
		
        int toRollLength = toRoll.length(); 
        int each_character_roll[] = new int[toRollLength]; 
        char[] toRollCharArr = toRoll.toCharArray(); 
  
        for (int i = 0; i < roll.length; ++i) { 
            ++each_character_roll[0]; 
            int noOfRoll = roll[i]; 
            if (noOfRoll >= each_character_roll.length) 
                continue; 
            else
                --each_character_roll[noOfRoll]; 
        } 
  
        IntStream.range(1, toRollLength).forEach(index -> { 
            each_character_roll[index] = each_character_roll[index] + each_character_roll[index - 1]; 
        }); 
  
        IntStream.range(0, toRollLength).forEach(index -> { 
            toRollCharArr[index] = roll_character(toRollCharArr[index], each_character_roll[index]); 
        }); 
  
        return String.valueOf(toRollCharArr); 
  
    } 
  
    public static char roll_character(char c, int roll) { 
        roll = roll % 26; 
        int character = c - 'a'; 
  
        return (char) ('a' + (character + roll) % 26); 
    } 
      
}
