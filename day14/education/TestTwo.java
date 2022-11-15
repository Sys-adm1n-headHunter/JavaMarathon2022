package day14.education;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestTwo {
    //Добавление исключения в сигнатуру метода
//    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("AAAA");
//
//        Scanner scanner = new Scanner(file);




//    public static void main(String[] args){ //Обработка с помощью исключения
//        File file = new File("AAAA");
//
//        try {
//            Scanner scanner = new Scanner(file);
//            /*
//            Любой код в блоке Try, после выбрасывания исключения не выолняется.
//            Если же не будет выбрашено исключение, то код в блок try выполнится. Но
//            не выполнется в блоке catch
//             */
//        } catch (FileNotFoundException e) {
//            //e.printStackTrace(); стандартная обработка
//            System.out.println("Файл не найден!"); // новая обработка
//        }
//        System.out.println("fffffffffffffffffffffffff");


    //Обработка необходима во всех методах, где может быть выбрашено исключение
    public static void main(String[] args) throws FileNotFoundException {
    readFile();
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("FFFF");
        Scanner scanner = new Scanner(file);
    }
}
