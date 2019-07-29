package ie.nln.softwaretester.arraylists;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> myStringsList = new ArrayList<String>();
		
		myStringsList.add("Hello");
		myStringsList.add(" ");
		myStringsList.add("World!");
		
		String message = "It's quite wet today";
		
		myStringsList.add(message);
		
		for(int i = 0; i < myStringsList.size(); i++) {
			String element = myStringsList.get(i);
			
			System.out.println(i + ": " + element);
		}
		
		myStringsList.remove(1);
		
		for(String s : myStringsList) {
			System.out.println(s);
		}
	}
}
