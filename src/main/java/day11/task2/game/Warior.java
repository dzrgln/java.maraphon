package day11.task2.game;

public class Warior extends Hero implements PhysAttack {
    public Warior() {
        this.health = 100;
        this.physAtt = 30;
        this.physDef = 80;
    }

    @Override
    public void physicalAttack(Hero hero) {

        hero.health = hero.health - this.physAtt * ((100 - hero.physDef) / 100);
        if (hero.health <= 0) {
            hero.health = 0;
        }
    }
}
