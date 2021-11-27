package day11.task2.game;

public class Magican extends Hero implements MagicAttack {
    public Magican() {
        this.health = 100;
        this.physAtt = 5;
        this.magicAtt = 20;
        this.magicDef = 80;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health = hero.health - this.magicAtt * ((100 - hero.magicDef) / 100);
        if (hero.health <= 0) {
            hero.health = 0;
        }
    }


}