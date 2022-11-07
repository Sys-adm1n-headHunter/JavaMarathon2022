package day04;

/* SAI
1. С клавиатуры вводится число n - размер массива. Необходимо создать массив
указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива
Пример:
Введено число 10. Сгенерирован следующий массив:
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
Информация о массиве:
Длина массива: 10
Количество чисел больше 8: 1
Количество чисел равных 1: 0
Количество четных чисел: 6
Количество нечетных чисел: 4
Сумма всех элементов массива: 46
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count8 = 0;
        int count1 = 0;
        int countEven = 0;
        int countOdd = 0;
        int sum = 0;

        int array[] = new int[n];


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 10); //Алишев делал через класс Random... random.nextInt(10)
            // метод floor округляет в меньшую сторону, ceil в меньшую, метод round от 0,5

            if (array[i] > 8) {
                count8++;
            }
            if (array[i] == 1) {
                count1++;
            }
            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            sum += array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + count8);
        System.out.println("Количество чисел равных 1: " + count1);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}

