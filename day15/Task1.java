package day15;
/*
Вам дан файл с информацией об остатках обуви на складе
(src/main/resources/shoes.csv). Это пример реальной выгрузки остатков из 1С
в csv файл (формат файла с разделителями, в качестве разделителя использован
символ “;”). В этом файле содержится информация о названии модели обуви, ее
размер и оставшееся на складе количество.

До преобразования в csv это была таблица с тремя колонками:
Необходимо сформировать новый файл
(src/main/resources/missing_shoes.txt) с информацией о моделях и
размерах обуви, которой нет на складе (количество = 0). Для этого реализуйте
программу, которая принимает на вход csv файл и создает новый txt файл
следующего содержания (должно получиться 11 строк):
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileShoes = new File("Shoes.csv");
        File fileMissingShoes = new File("missing_shoes.txt");
        PrintWriter printWriter = new PrintWriter(fileMissingShoes);


        Scanner scanner = new Scanner(fileShoes);
        List<String> shoesFile = new ArrayList<>();

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String [] parseArrayShoes = line.split(";");

            if(Integer.parseInt(parseArrayShoes[2]) == 0){
                printWriter.println(line);
            }
        }
        printWriter.close();
        }

}
