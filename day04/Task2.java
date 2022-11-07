package day04;

/* SAI
2. Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
- наибольший элемент массива
- наименьший элемент массива
- количество элементов массива, оканчивающихся на 0
- сумму элементов массива, оканчивающихся на 0
Использовать сортировку запрещен
 */

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[100];
        int max = 0;
        int min = 10000;
        int count0 = 0;
        int sum0 = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);

        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Наименьший элемент массива: " + min);

        for (int i : array) {
            if (i % 10 == 0) {
                count0++;
                sum0 += i;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count0);
        System.out.println("Cумма элементов массива, оканчивающихся на 0: " + sum0);
    }
}
