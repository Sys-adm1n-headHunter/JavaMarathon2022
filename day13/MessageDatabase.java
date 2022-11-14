package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);
        messages.add(message);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message messageTemp : messages) {
            if (messageTemp.getSender() == u1 && messageTemp.getReceiver() == u2
                    || messageTemp.getSender() == u2 && messageTemp.getReceiver() == u1) {
                System.out.println(messageTemp.getSender().getUsername() + ": " + messageTemp.getText());
            }
        }
    }
}

