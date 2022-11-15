package day14.education;

import java.io.IOException;
import java.util.Scanner;

public class TestThree {
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true){
//            int x = Integer.parseInt(scanner.nextLine());
//
//            if (x!=0) {
//                throw new IOException();    //выбрасываем исключение
//            }
//        }
//    }




    public static void main(String[] args) throws ScannerException{
        Scanner scanner = new Scanner(System.in);

        while (true){
            int x = Integer.parseInt(scanner.nextLine());

//            if (x!=0) {
//                try {
//                    throw new IOException();    //выбрасываем исключение
//                } catch (IOException e) {
//                    System.out.println("Введено не ноль!");
//                }
//            }

            if (x!=0) {
                    throw new ScannerException("Не ноль!");    //выбрасываем исключение

            }
        }
    }
    //проверяемые - это исключенря которые надо обрабатывать
    //непроверяемые - считается ошибкой, а ошибку надо исправлять.
}
