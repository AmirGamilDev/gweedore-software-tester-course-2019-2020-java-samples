package ie.nln.softwaretester.basics;

import java.util.ArrayList;

public class StarList {

	public static void main(String[] args) {
		ArrayList<String> myStringList = new ArrayList<String>();
		
		myStringList.add("the");
		myStringList.add("quick");
		myStringList.add("brown");
		myStringList.add("fox");
		
		ArrayList<String> modifiedList = addStars(myStringList);
		
		System.out.println("Modified list " + modifiedList);
		
		removeStars(modifiedList);
		
		System.out.println("List with stars removed: " + modifiedList);
	}
	
	public static ArrayList<String> addStars(ArrayList<String> list) {
		ArrayList<String> tempList = new ArrayList<String>();
		
		for(String s : list) {
			tempList.add(s);
			tempList.add("*");
		}
		
		return tempList;
	}
	
	private static void removeStars(ArrayList<String> list) {
		for(int i = 1; i < list.size(); i++) {
			list.remove(i);
		}
	}
}
