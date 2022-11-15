package day14.education;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class TestFor {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //или использовать мулти catch
//        catch (IOException | ParseException e) {
//            e.printStackTrace();
//        }
    }
    public static  void run() throws IOException, ParseException, IllegalArgumentException{

    }
}
