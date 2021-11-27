package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<User> subscriptions = new ArrayList<>();

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user){
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return this.subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return this.subscriptions.contains(user) && user.subscriptions.contains(this);
    }

    public void sendMessage(User user, String text) {
        if (isFriend(user) == true) {
            MessegeDatebase.addNewMessage(this, user, text);
        }else {
            System.out.println("Сообщения можно посылать только друзьям");
        }
    }

    public String toString() {
        return userName;
    }
}
