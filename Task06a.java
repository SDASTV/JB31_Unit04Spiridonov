package by.epam.unit04.main;

import java.util.Random;

public class Task06a {

	public static void main(String[] args) {
		int[][] source = new int[5][10];
		int[] target = new int[10];
		Random rand = new Random();
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source[i].length; j++) {
				source[i][j] = rand.nextInt(10);
			}
		}
		System.out.println("Исходная матрица:\n");
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source[i].length; j++) {
				System.out.printf("[%1d] ", source[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source[i].length; j++) {
				switch (source[i][j]) {
				case 0:
					target[0]++;
					break;
				case 1:
					target[1]++;
					break;
				case 2:
					target[2]++;
					break;
				case 3:
					target[3]++;
					break;
				case 4:
					target[4]++;
					break;
				case 5:
					target[5]++;
					break;
				case 6:
					target[6]++;
					break;
				case 7:
					target[7]++;
					break;
				case 8:
					target[8]++;
					break;
				case 9:
					target[9]++;
					break;
				}
			}
		}
		System.out.print("\nРезультат (конечный массив из количества встречающихся чисел исходного массива): ");
		for (int i = 0; i < target.length; i++) {
			System.out.printf("[%1d] ", target[i]);
		}
	}
}
