package day16;
/* SAY
Реализовать программу, записывающую числа разных типов в 2 файла.
Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
Оба файла должны находиться в корне проекта. Создаваться файлы должны не
вручную, а при запуске программы.
Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
Файл 2 создается на основании Файла 1, но содержит числа вещественного типа
данных.
Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из
Файла 1 рассчитывается их среднее арифметическое. Затем, полученное значение
записывается в Файл 2. Таким образом в Файле 2 будет находиться 50 вещественных
чисел (1000 / 20 = 50).
После того, как Файл 2 будет сформирован, необходимо реализовать статический
метод printResult(File file). Этот метод должен рассчитать сумму всех
вещественных чисел из Файла 2 и вывести её в консоль, отбросив вещественную
часть.
Прим
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        //Создание и заполнение файла 1
        Random random = new Random();
        File file = new File("file1.txt");
        PrintWriter pw = new PrintWriter(file);

        for (int i = 0; i < 1000; i++) {
            pw.println(random.nextInt(100));
        }
        pw.close();

        //Создание и зполнение файла 2
        Scanner scanner = new Scanner(file);
        File file2 = new File("file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);
        int counter = 0;
        int sum = 0;

        while (scanner.hasNextLine()) {

            String s = scanner.nextLine();
            sum += Integer.parseInt(scanner.nextLine());
            counter++;
            if (counter == 20) {
                pw2.println(sum / 20.0);
                counter = 0;
                sum = 0;
            }
        }
        scanner.close();
        pw2.close();


        //Методя для подсчета суммы
        printResult(file2);

    }


    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double result = 0;
        while (scanner.hasNextLine()) {
            result += Double.parseDouble(scanner.nextLine());
        }
        System.out.println((int) result);
        scanner.close();
    }
}

