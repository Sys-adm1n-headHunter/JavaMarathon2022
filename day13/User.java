package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        if (!isSubscribed(user)) {
            this.subscriptions.add(user);
        }
    }

    public boolean isSubscribed(User user) {   //Проверка подписки на пользователя
        for (User userTemp : subscriptions) {
            if (userTemp.getUsername().equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user) {       //Проверка на друга в контексте соц.сетей
        return user.isSubscribed(this) && this.isSubscribed(user);

    }

    public void sendMessage(User user, String text) {       //Отправка сообщения через статический метод
    MessageDatabase.sendMessage(this,user,text);
    }

    @Override
    public String toString() {
        return  username ;
    }
}
