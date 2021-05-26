package by.epam.unit04.main;

import java.util.Random;

public class Task04a {

	public static void main(String[] args) {
		int[] array = new int[10];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1000);
		}
		System.out.print("Исходный массив:\t\t\t\t");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%3d] ", array[i]);
		}
		System.out.println("\n");
		int max, select;
		for (int i = 0; i < array.length - 1; i++) {
			max = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[max]) {
					max = j;
				}
			}
			select = array[i];
			array[i] = array[max];
			array[max] = select;
			System.out.print("Массив после " + (i+1) + "-й итерации:\t\t\t");
			for (int k = 0; k < array.length; k++) {
				System.out.printf("[%3d] ", array[k]);
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.print("Результат (cортировка выбором по убыванию):\t");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%3d] ", array[i]);
		}
	}
}
