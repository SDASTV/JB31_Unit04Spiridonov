package by.epam.unit04.main;

import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(1000);
			}
		}
		System.out.println("Исходная матрица:\n");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%3d] ", array[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nДиагональные элементы матрицы:\n");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					System.out.printf("[%3d] ", array[i][j]);
				}
				else {
					System.out.printf("[ * ] ");
				}
			}
			System.out.println();
		}
	}
}	