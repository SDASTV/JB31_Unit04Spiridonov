package by.epam.unit04.main;

import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
		int[] source = new int[10];
		Random rand = new Random();
		for (int i = 0; i < source.length; i++) {
			source[i] = rand.nextInt(1000);
		}
		System.out.print("Исходный массив: ");
		for (int i = 0; i < source.length; i++) {
			System.out.printf("%3d ", source[i]);
		}
		System.out.println("\n");
		int even = 0;
		for (int i = 0; i < source.length; i++) {
			if (source[i] % 2 == 0) {
				even++;
			}
		}
		int[] target = new int[even];
		for (int i = 0, j = 0; i < source.length; i++) {
			if (source[i] %2 == 0) {
				target[j++] = source[i];
			}
		}
		System.out.print("Результат (конечный массив из чётных чисел исходного массива): ");
		for (int i = 0; i < target.length; i++) {
			System.out.printf("%3d ", target[i]);
		}
	}
}
