package day16;

/* SAY
Реализовать программу, которая на вход принимает txt файл с целыми числами
(можно использовать файл из задания 1 дня 14) и в качестве ответа выводит в
консоль среднее арифметическое этих чисел.
Ответ будет являться вещественным числом. В консоль необходимо вывести полную
запись вещественного числа (со всеми знаками после запятой) и сокращенную запись
(с 3 знаками после запятой).
Детали реализации: В классе Task1 создать публичный статический метод
printResult(File file), в котором реализовать вышеописанную логику. В методе
main() класса Task1 вызвать метод printResult(File file), передав ему в
качестве аргумента объект класса File (txt файл с целыми числами).
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        printResult(file);

    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] charsLine = line.split(" ");
        int[] numbersInt = new int[charsLine.length];

        int sum = 0;
        int count = 0;


        for (String currentNumberString : charsLine) {
            int i = Integer.parseInt(currentNumberString);
            sum += i;
            count++;
        }

        double result = (double) sum / numbersInt.length;
        System.out.printf("%.3f", result);

    }
}
