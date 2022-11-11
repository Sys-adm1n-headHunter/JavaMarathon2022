package day12.task3;
/* SAY
3. *Выполнять в подпапке task3 в day12*
Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year
(название музыкальной группы и год основания). Создать 10 или более экземпляров
класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
список. Создать статический метод в классе Task3:
public static List<MusicBand> groupsAfter2000(List<MusicBand>
bands)
Этот метод принимает список групп в качестве аргумента и возвращает новый список,
состоящий из групп, основанных после 2000 года. Вызвать метод
groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными
после 2000 года)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List musicBands = Arrays.asList(new MusicBand("Машина Времени",1968 ), new MusicBand("23:45", 	2006), new MusicBand("ARIA",1985),
                new MusicBand("Serebro",2006), new MusicBand("t.A.T.u.",  	1999),new MusicBand("Би-2",1988), new MusicBand("Винтаж",2006),
                new MusicBand("Градусы",2008), new MusicBand("Дискотека Авария",1990), new MusicBand("5sta Family",2004));

        Collections.shuffle(musicBands); //метод для переменивания массива
        System.out.println(musicBands);

        musicBands = groupsAfter2000(musicBands);
        System.out.println(musicBands);
    }

    //Метод для создания списка группы созданных после 2000
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> newMusicBands = new ArrayList<>();
        for (MusicBand musicBand: bands) {
            if (musicBand.getYear()>=2000){
                newMusicBands.add(musicBand);
            }
        }
        return newMusicBands;
    }

}
