package by.epam.unit04.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		double[] array = new double[10];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = -100 + rand.nextInt(100 - (-100));
		}
		System.out.print("Исходный массив: ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%3.0f] ", array[i]);
		}
		System.out.println("\n");
		int positive = 0;
		int negative = 0;
		int zero = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				positive++;
			}
			if (array[i] < 0) {
				negative++;
			}
			if (array[i] == 0) {
				zero++;
			}
		}
		System.out.println("Результат (количество элементов): ");
		System.out.println("- " + positive + " положительных");
		System.out.println("- " + negative + " отрицательных");
		System.out.println("- " + zero + " нулевых");
	}
}
