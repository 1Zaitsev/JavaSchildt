package chapter19;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10 ; i++) {
            array[i] = -3 * i;
        }
        System.out.println("Исходный массив: ");
        display(array);

        Arrays.sort(array);
        System.out.println("Отсортированный массив: ");
        display(array);

        Arrays.fill(array, 2, 6, -1);
        System.out.println("Массив после вызова метода fill(): ");
        display(array);

        Arrays.sort(array);
        System.out.println("Повторно отсортированный массив: ");
        display(array);

        System.out.print("Значение -9 находиться на позиции ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }

    static void display(int[] array){
        for (int i:array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
