package day13;
/* SAI
Нам необходимо создать свою небольшую социальную сеть на Java.
Для этого мы должны реализовать следующие классы:
User - сущность “Пользователь”
Message - сущность “Сообщение”
MessageDatabase - класс, который будет заниматься хранением сообщений
Test - класс, где в методе main() мы будем тестировать нашу соц. сеть
 */

import java.util.Date;

public class Test {
    public static void main(String[] args) {
    User user1 = new User("Arthur");
    User user2 = new User("Lola");
    User user3 = new User("Dora");

    user1.sendMessage(user2,"Привел Lola, как дела?");
    user1.sendMessage(user2,"Что нового у тебя?");

    user2.sendMessage(user1,"Привет Arthur!");
    user2.sendMessage(user1,"У меня все хорошо, как твои?");
    user2.sendMessage(user1,"Давай лучше встретимся?");

    user3.sendMessage(user1, "Хей, не забудь сегодня у нас тренировка)");
    user3.sendMessage(user1, "Возьми с собой больше воды.");
    user3.sendMessage(user1, "Опоздаю на минут 15");

    user1.sendMessage(user3, "Салют! спасибо за напоминание");
    user1.sendMessage(user3, "Скинь инфу по сегоднящней программе");
    user1.sendMessage(user3, "Я примерно также опоздаю =)");

    user3.sendMessage(user1, " ахахаха, =D");

    MessageDatabase.showDialog(user1,user3);
    }
}
