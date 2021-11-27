package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Player a = new Player(rand.nextInt(11) + 90);
        Player b = new Player(rand.nextInt(11) + 90);
        Player c = new Player(rand.nextInt(11) + 90);
        Player d = new Player(rand.nextInt(11) + 90);
        Player e = new Player(rand.nextInt(11) + 90);
        Player f = new Player(rand.nextInt(11) + 90);


        Player.info();
        while (a.getStamina()>Player.getMinStamina()) {
            Player.run(a);
        }
        Player.info();
    }
}

class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        if (countPlayers > 6) {
            countPlayers = 6;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static int getMinStamina(){
        return MIN_STAMINA;
    }

    public static void run(Player a) {
        if(a.stamina>0) {
            a.stamina = a.stamina - 1;
        } else {
            a.stamina=0;
        }
        if (a.stamina == 0) {
            Player.countPlayers = Player.countPlayers - 1;
        }
    }
    public static void info() {
        if (Player.countPlayers < 6) {
            int a = 6 - Player.countPlayers;
            if (a == 1) {
                System.out.println("Еще есть " + a + " свободное место");
            } else if (a == 5) {
                System.out.println("Еще есть " + a + " свободных мест");
            } else {
                System.out.println("Еще есть " + a + " свободных места");
            }
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}



