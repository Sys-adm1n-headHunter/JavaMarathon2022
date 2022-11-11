package day12.task2;
/* SAI
Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
Вывести список.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= 350; i++) {
            if(0<=i && i<=30 ){
                arr.add(i);
            }else if (300<=i && i<=350){
                arr.add(i);
            }
        }
        System.out.println(arr);
    }
}
