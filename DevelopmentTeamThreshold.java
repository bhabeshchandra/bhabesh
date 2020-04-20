package com.org.dtt;
import java.io.*; 
import java.math.*; 
import java.security.*; 
import java.text.*; 
import java.util.*; 
import java.util.concurrent.*; 
import java.util.function.*; 
import java.util.regex.*;
import java.util.stream.*; 
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DevelopmentTeamThreshold {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH"))); 
		int teamsRows = Integer.parseInt(bufferedReader.readLine().trim());
		int teamsColumns = Integer.parseInt(bufferedReader.readLine().trim());
		List<List<Integer>> teams = new ArrayList<>(); 
		IntStream.range(0, teamsRows).forEach(i -> {
			try {
				teams.add(
						Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList())
						);
				} catch (IOException ex) {
					throw new RuntimeException(ex);
					}
			});
		int r = Integer.parseInt(bufferedReader.readLine().trim()); 
		int result = devTeam(teams, r); 
		//bufferedWriter.write(String.valueOf(result));
		//bufferedWriter.newLine(); bufferedReader.close(); 
		//bufferedWriter.close(); 
		}
	
	public static int devTeam(List<List<Integer>> list, int r) {
		Integer SeniorDevlop = 0;
		Integer teamMember = 0;
		double SeniorDev = 0;
		double percentage = 0.0;
		int count=0;
		for (List<Integer> teams : list) {
			SeniorDevlop = SeniorDevlop + teams.get(0);
			teamMember = teamMember + teams.get(1);
		}
		SeniorDev = SeniorDevlop;
		while (percentage < r) {
			percentage = (double)(SeniorDev / teamMember++) * 100;
			SeniorDev++;
			count++ ;
		}
		System.out.println(count);
		return count;
	}
}
