package day13;

public class Task1 {
    public static void main(String[] args) {

// Create users
        User mark = new User("Mark");
        User jhon = new User("Jhon");
        User bob = new User("Bob");

//Users subscribe each over
        mark.subscribe(jhon);
        mark.subscribe(bob);
        jhon.subscribe(mark);
        jhon.subscribe(bob);
        bob.subscribe(jhon);
        bob.subscribe(mark);

//Отправить 2 сообщения от пользователя 1 пользователю 2
        mark.sendMessage(jhon, "Hi");
        mark.sendMessage(jhon, "What's up?");
//Отправить 3 сообщения от пользователя 2 пользователю 1
        jhon.sendMessage(mark, "H!");
        jhon.sendMessage(mark, "I'm working all days");
        jhon.sendMessage(mark, "How are you?");
// Отправить 3 сообщения от пользователя 3 пользователю 1
        bob.sendMessage(mark, "Hi");
        bob.sendMessage(mark, "Jhon said, that you will work this weekend?");
        bob.sendMessage(mark, "Maybe it's time to change jobs?");
//Отправить 3 сообщения от пользователя 1 пользователю 3
        mark.sendMessage(bob, "Hi, Bob!");
        mark.sendMessage(bob, "I think it over");
        mark.sendMessage(bob, "I'm getting very tired here");
// Отправить 1 сообщение от пользователя 3 пользователю 1
        bob.sendMessage(mark, "Make the right choice!");

        MessegeDatebase.showDialog(mark, bob);
        System.out.println(MessegeDatebase.getMessages());
        


//        System.out.println(a.getSubscriptions());
//        System.out.println(b.getSubscriptions());
//        System.out.println(a.isSubscribed(b));
//        System.out.println(b.isSubscribed(a));
//
//        System.out.println(a.isFriend(b));
//        System.out.println(b.isFriend(a));

    }
}
