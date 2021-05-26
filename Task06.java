package by.epam.unit04.main;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		int[][] array = new int[5][10];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(10);
			}
		}
		int n = 0;
		System.out.println("Исходная матрица:\n");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%1d] ", array[i][j]);
				if (array[i][j] == 7) {
					n++;
				}
			}
			System.out.println();
		}
		if (n == 2 | n == 3 | n == 4) {
			System.out.println("\nЧисло {7} встречается в матрице " + n + " раза.");
		}
		else {
			System.out.println("\nЧисло {7} встречается в матрице " + n + " раз.");
		}
	}
}	