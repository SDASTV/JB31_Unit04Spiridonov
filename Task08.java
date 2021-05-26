package by.epam.unit04.main;

import java.util.Random;

public class Task08 {

	public static void main(String[] args) {
		int[][] array = new int[5][10];
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
		System.out.println("\n3-я строка, 4-й и 7-й столбцы:\n");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == 2 | j == 3 | j == 6) {
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