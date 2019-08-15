package ie.nln.softwaretester.arrays;


public class TwoDimensions {

	public static void main(String[] args) {
		
		int[][] days = {
							{23, 5, 4}, 
							{3, 54, 8}
			           };
		
		System.out.println("yo");
		
		for(int i = 0; i < days.length; i++) {
			for(int j = 0; j < days[i].length; j++) {
				System.out.println("days[" + i + "][" + j + "]: " + days[i][j]);
			}
		}
		
		for(int[] row : days) {
			for(int element : row) {
				System.out.println(element);
			}
		}
	}
}
