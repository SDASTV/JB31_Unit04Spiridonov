package by.epam.unit04.main;

import java.util.Random;

public class Task05 {

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
		int in, out, select;
		for (out = 1; out < array.length; out++) {
            select = array[out];
            in = out;
            while (in > 0 && array[in - 1] > select) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = select;
            System.out.print("Массив после " + out + "-й итерации:\t\t");
			for (int k = 0; k < array.length; k++) {
				System.out.printf("%3d ", array[k]);
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.print("Результат (сортировка вставками):\t");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%3d ", array[i]);
		}
	}
}
