package day04;

/* SAI
3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
строк несколько, вывести индекс последней из них.
Пример сгенерированной матрицы (для простоты m=3, n=5):
3 2 1 5 7 // сумма - 18
1 2 5 6 2 // сумма - 16
3 4 9 6 4 // сумма - 26
Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
 */

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        Random random = new Random();

        int array[][] = new int[m][n];

        int maxSum = 0;
        int sum = 0;
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(50);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += array[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
            System.out.print(Arrays.toString(array[i]) + "   ");
            System.out.println(sum);
            sum = 0;
        }

        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + index);


    }
}
