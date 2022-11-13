package day12.task4;
/* SAI
*Выполнять в подпапке task4 в day12*
Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в
группу можно было добавлять и удалять участников. Под участником понимается
строка (String) с именем и фамилией. Реализовать статический метод слияния групп
(в классе MusicBand), т.е. все участники группы А переходят в группу B. Название
метода: transferMembers. Этот метод принимает в качестве аргументов два
экземпляра класса MusicBand. Реализовать метод printMembers (в классе
MusicBand), выводящий список участников в консоль. Проверить состав групп после
слияния.
 */

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersOne = new ArrayList<>();
        membersOne.add("1A");
        membersOne.add("2A");
        membersOne.add("3A");
        membersOne.add("4A");

        MusicBand A = new MusicBand("A",2000,membersOne);
        A.printMembers();


        List<String> membersTwo = new ArrayList<>();
        membersTwo.add("5B");
        membersTwo.add("6B");
        membersTwo.add("7B");
        membersTwo.add("8B");
        MusicBand B = new MusicBand("B",2001,membersTwo );

        B.printMembers();

        MusicBand.transferMembers(A,B);
        A.printMembers();
        B.printMembers();
    }
}
