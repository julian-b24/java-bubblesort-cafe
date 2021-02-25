package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	private static List<ArrayList<Double>> lists;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int numCases = Integer.parseInt(br.readLine());
		lists = new ArrayList<ArrayList<Double>>();
		
		//Get of all cases input
		String line = br.readLine();
		while (!line.isEmpty()) {
			
			String[] info = line.split(" ");
			ArrayList<Double> list = lineToDouble(info); 
			lists.add(list);
			line = br.readLine();
		}
		
		String output = sortLists();
		bw.write(output);
		
		br.close();
		bw.close();
	}

	private static ArrayList<Double> lineToDouble(String[] line) {
		
		ArrayList<Double> list = new ArrayList<Double>();
		for (String num : line) {
			double value = Double.parseDouble(num);
			list.add(value);
		}
		
		return list;
	}
	
	
	private static String sortLists() {
	
		String output = "";
		
		for (ArrayList<Double> list : lists) {
			double changes = 0;
			double iterations = 0;
			boolean changed = true;
			
			//Bubble sort
			for (int i = 1; i < list.size() - 1 && changed; i++) {
				changed = true;
				
				for (int j = 0; j < list.size() - i; j++) {
					
					if (list.get(j + 1) < list.get(j)) {
						double temp = list.get(j);
						list.set(j, list.get(j+1));
						list.set(j + 1, temp);
						changed = true;
						changes++;
					}
				}
				iterations++;
			}
			
			double average = changes/iterations;
			output += String.format("%.2f", average) + "-" + listToString(list) + "\n";
		}
		
		return output;
	}

	private static String listToString(ArrayList<Double> list) {

		ArrayList<String> listString = new ArrayList<String>();
		
		for (Double db : list) {
			listString.add(db.toString());
		}
		
		String text = String.join(" ", listString);
		
		return text;
	}

}
