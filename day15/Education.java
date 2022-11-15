package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Education {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile");
        PrintWriter printWriter = new PrintWriter(file);


        printWriter.println("Первая строка!");
        printWriter.println("Попытка номер два");
        printWriter.close();


    }
}
