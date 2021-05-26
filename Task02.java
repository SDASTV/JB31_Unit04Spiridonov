package by.epam.unit04.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		int min, max;
		int[] array = new int[10];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1000);
		}
		System.out.print("Исходный массив: ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%3d ", array[i]);
		}
		System.out.println("\n");
		min = array[0];
		max = array[9];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > min) {
				max = array[i];
			}
		}
		System.out.println("Результат: min = " + min + ", max = " + max + ", d = " + (max - min));
	}
}
