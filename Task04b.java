package by.epam.unit04.main;

import java.util.Random;

public class Task04b {

	public static void main(String[] args) {
		int[] array = new int[10];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1000);
		}
		System.out.print("Исходный массив:\t\t\t");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%3d ", array[i]);
		}
		System.out.println("\n");
		boolean sorted = false;
		int n = 0, select;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i+1]) {
					select = array[i];
					array[i] = array[i+1];
					array[i+1] = select;
					sorted = false;
				}
			}
			System.out.print("Массив после " + (n+1) + "-й итерации:\t\t");
			for (int k = 0; k < array.length; k++) {
				System.out.printf("%3d ", array[k]);
			}
			n++;
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.print("Результат (сортировка пузырьком):\t");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%3d ", array[i]);
		}
	}
}
