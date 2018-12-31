package _02_More_Algorithms;

import java.util.List;

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
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) >= 6.6) {
				return i;
			}
		}
		return 0;
	}
}
