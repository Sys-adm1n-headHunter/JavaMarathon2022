package day14.task1;
/* SAI
1. Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30).
Заполнить его вручную десятью произвольными числами. Реализовать статический
метод printSumDigits(File file), который считает сумму всех чисел в этом
файле и выводит ее на экран. Вызвать данный метод в методе main().
Если файла не существует в папке проекта, в программе необходимо выбрасывать
исключение и выводить в консоль сообщение “Файл не найден”. Помимо этого, если
чисел в файле меньше или больше 10, необходимо выбрасывать исключение и
выводить в консоль сообщение “Некорректный входной файл”.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("input.txt");
        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberException e) {
            e.printStackTrace();
        }

    }
    public static void printSumDigits(File file) throws FileNotFoundException, NumberException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] charsLine =  line.split(" ");
        int[] numbersInt = new int[10];
        int counter = 0;
        int sum = 0;

        if (charsLine.length != 10){
            throw new NumberException("Некорректный входной файл");
        }

        for (String charLine: charsLine) {
            int a = Integer.parseInt(charLine);
            sum+=a;
            counter++;
        }

        System.out.println(sum);
    }

}
