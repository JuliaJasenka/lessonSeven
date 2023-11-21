package edu.training.lesson7.main;

import java.util.Arrays;
import java.util.Random;

public class Task07 {

	public static void main(String[] args) {

		int n = 7;
		int[] x = new int[n];

		initArrayWithRandom(x);

		printArray("Исходный массив: \t  ", x);

		int[] y = createSortedArray(x);

		printArray("Массив после сортировки : ", y);
	}

	public static void initArrayWithRandom(int[] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(31) - 10;
		}
	}

	public static void printArray(String message, int[] mas) {
		System.out.print(message);
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}

	private static int[] createSortedArray(int[] arr) {
		int[] modifArr = Arrays.copyOf(arr, arr.length);

		boolean changes;
		do {
			changes = false;
			for (int i = 0; i < modifArr.length - 1; i++) {
				if (modifArr[i] < modifArr[i + 1]) {
					int current = modifArr[i];
					modifArr[i] = modifArr[i + 1];
					modifArr[i + 1] = current;
					changes = true;
				}
			}
		} while (changes);
		return modifArr;
	}
}
