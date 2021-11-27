package day11.task2;

import day11.task2.game.Magican;
import day11.task2.game.Paladin;
import day11.task2.game.Shaman;
import day11.task2.game.Warior;

public class Task2 {
    public static void main(String[] args) {
        Warior war = new Warior();
        Paladin pal = new Paladin();
        Magican mag = new Magican();
        Shaman sham = new Shaman();


        war.physicalAttack(pal);
        System.out.println("Здоровье паладина: " + pal.getHealth());

        pal.physicalAttack(mag);
        System.out.println("Здоровье мага: " + mag.getHealth());

        sham.healTeammate(mag);
        System.out.println("Здоровье мага: " + mag.getHealth());

        mag.magicalAttack(pal);
        System.out.println("Здоровье паладина: " + pal.getHealth());

        sham.physicalAttack(war);
        System.out.println("Здоровье война: " + war.getHealth());

        pal.healHimself();
        System.out.println("Здоровье паладина: " + pal.getHealth());

        for(int i = 0; i<5; i++){
            war.physicalAttack(mag);
            System.out.println("Здоровье мага: " + mag.getHealth());

        }

    }
}
