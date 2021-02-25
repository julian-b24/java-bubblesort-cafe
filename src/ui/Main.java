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
		
		//lists = sortLists();
		
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
	
	
	private static List<ArrayList<Double>> sortLists() {
	
		return null;
	}

}
