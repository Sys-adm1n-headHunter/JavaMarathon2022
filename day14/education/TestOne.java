package day14.education;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) throws FileNotFoundException {
        
        String separation = File.separator;  //Разделитель исходя из системы
        String path = separation +"C:"+ separation + "Users" + separation + "iRU" + separation+
                "Downloads" + separation+ "TestOneFile.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);

//        while (scanner.hasNextLine()){       //Пока есть строка, работае вывод на экран(ПР1)
//            System.out.println(scanner.nextLine());
//        }
//
//        scanner.close();  //Обязательно закрывать сканер, чтобы освободить ресурсы


        
        String line = scanner.nextLine();
        String[] numbersString = line.split(" "); //Пробел является разделителем в файле (ПР2)
        int[] numbersInt = new int[4];
        int counter = 0;

        for (String number: numbersString) {
            numbersInt[counter++] = Integer.parseInt(number); //Преобразование строки в число
        }
        System.out.println(Arrays.toString(numbersInt));
        scanner.close();

        //Если создать файл в папке проекта, то не нужно создавать полный путь, достаточно написать название файла
    }
}
