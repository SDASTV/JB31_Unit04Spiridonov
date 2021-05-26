package by.epam.unit04.main;

public class Task10 {

	public static void main(String[] args) {
		int n = 10;
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = 1;
			}
		}
		for (int i = 1; i < array.length - 1; i++) {
			for (int j = 1; j < array[i].length - 1; j++) {
				array[i][j] = 0;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%2d] ", array[i][j]);
			}
			System.out.println();
		}
	}
}