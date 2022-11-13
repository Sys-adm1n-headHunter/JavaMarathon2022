package day12.task5;

import java.util.ArrayList;
import java.util.List;
/* SAI
Скопировать MusicBand из прошлого задания и доработать - теперь у участника
музыкальной группы есть не только имя, но и возраст. Соответственно, теперь под
участником понимается не строка, а объект класса MusicArtist. Необходимо
реализовать класс MusicArtist и доработать класс MusicBand (создать копию
класса) таким образом, чтобы участники были - объекты класса MusicArtist. После
этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и
проверить состав групп после слияния. Методы для слияния и для вывода участников
в консоль необходимо тоже переработать, чтобы они работали с объектами класса
MusicArtist
 */

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> artistsOne = new ArrayList<>();                       //Создание списка артистов группы 1
        MusicArtist musicArtist1 = new MusicArtist("Ivan",32);
        MusicArtist musicArtist2 = new MusicArtist("Vova", 20);
        MusicArtist musicArtist3 = new MusicArtist("Pavel",27);
        artistsOne.add(musicArtist1);
        artistsOne.add(musicArtist2);
        artistsOne.add(musicArtist3);

        MusicBand musicBandOne = new MusicBand("One",2005,artistsOne); //Создание группы 1


        List<MusicArtist> artistsTwo = new ArrayList<>();                       //Создание списка артистов группы 2
        MusicArtist musicArtist4 = new MusicArtist("Alex",48);
        MusicArtist musicArtist5 = new MusicArtist("Den",29);
        MusicArtist musicArtist6 = new MusicArtist("Nik",33);
        artistsTwo.add(musicArtist4);
        artistsTwo.add(musicArtist5);
        artistsTwo.add(musicArtist6);

        MusicBand musicBandTwo = new MusicBand("Two",2010,artistsTwo); //Создание группы 2

        musicBandOne.printMembers();
        musicBandTwo.printMembers();

        MusicBand.transferMembers(musicBandOne,musicBandTwo);
        musicBandOne.printMembers();
        musicBandTwo.printMembers();
    }
}
