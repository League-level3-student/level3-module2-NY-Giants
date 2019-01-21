package _02_More_Algorithms;

import java.util.List;

import _00_Sorting_Algorithms.SortingVisualizer;

public class Algorithms {
	public static Object findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return null;
	}

	public static Object countPearls(List<Boolean> oysters) {
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i).equals(true)) {
				return i;
			}
		}
		return null;
	}

	public static double findTallest(List<Double> peeps) {
		Double ali_a = peeps.get(0);
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) >= ali_a) {
				ali_a = peeps.get(i);
			}
		}
		return ali_a;
	}

	public static String findLongestWord(List<String> words) {
		String ali_a3 = words.get(0);
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > ali_a3.length()) {
				ali_a3 = words.get(i);
			}
		}
		return ali_a3;
	}

	public static boolean containsSOS(List<String> message1) {
		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).trim().equals("... --- ...")) {
				return true;
			}
		
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
			for(int i = 0; i < results.size(); i++) {
				for(int j = 0; j < results.size() - i - 1; j++) {
					if(results.get(j) < results.get(j+1)) {
						
					}
					else {
						Double temp = results.get(j);
						results.set(j, results.get(j+1));
						results.set(j+1, temp);
					}
				}
			}
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		for(int i = 0; i < unsortedSequences.size(); i++) {
			for(int j = 0; j < unsortedSequences.size() - i - 1; j++) {
				if(unsortedSequences.get(j).length() < unsortedSequences.get(j+1).length()) {
					
				}
				else {
					String temp = unsortedSequences.get(j);
					unsortedSequences.set(j, unsortedSequences.get(j+1));
					unsortedSequences.set(j+1, temp);
				}
			}
		}
	return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		for(int i = 0; i < words.size(); i++) {
			for(int j = 0; j < words.size() - i - 1; j++) {
				if(words.get(j).compareTo(words.get(j+1)) < 0) {
					
				}
				else {
					String temp = words.get(j);
					words.set(j, words.get(j+1));
					words.set(j+1, temp);
				}
			}
	}
		return words;
	}
}
