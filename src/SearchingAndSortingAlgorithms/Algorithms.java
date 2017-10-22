package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		
		for (int i = 0; i < eggs.size(); i++) {
			
			if(eggs.get(i)=="cracked") {
				return i;
			}
			
		}
		return 0;	
	}
	static int oysterCount = 0;
	public static int countPearls(List<Boolean> oysters) {
		
		for (int i = 0; i < oysters.size(); i++) {
			
			if(oysters.get(i)==true) {
				oysterCount +=1;
			}
			
		}
		return oysterCount;
	}
	static double value = 0;
	public static int findTallest(List<Double> peeps) {
		
		for (int i = 0; i < peeps.size(); i++) {
			
			if(peeps.get(i) > value)){
			value = peeps.get(i);
		}
		return value;
	}
	
	static int place = 0;
	static int length = 0;
	public static String findLongestWord(List<String> words) {
		
		for (int i = 0; i < words.size(); i++) {
	
			if(words.get(i).length()>length) {
				place = i;
				length = words.get(i).length();
			}
		}		
		return words.get(place);
	}
	
	public static boolean containsSOS(List<Boolean> list) {
		
		for (int i = 0; i < list.size(); i++) {
			
			if(list.contains("...---...")) {
				
				return true;
				
			}
			
		}
		return false;
	}
	static double t = 0;
	static double p = 0;
	static double q = 0;
	public static List<Double> sortScores(List<Double> results) {
		
		for (int x = 0; x < results.size(); x++) {
			for (int y = 0; y < x+1; y++) {
				p = results.get(x);
				q = results.get(y);
				if(q>p) {
					
					t = p;
					p=q;
					q=t;
					
				}
				
			}
			
		}
		return results;
		
	}
	
	//Add other methods here
}