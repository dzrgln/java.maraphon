package day11.task2.game;

public class Paladin extends Hero implements PhysAttack, MagicAttack, Healer {
    public Paladin() {
        this.health = 100;
        this.physAtt = 15;
        this.physDef = 50;
        this.magicDef = 20;
    }

    @Override
    public void healHimself() {
        this.health = this.health + 25;
        if(this.health >100){
            this.health = 100;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health = hero.health + 10;
        if(hero.health>100){
            hero.health = 100;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health = hero.health - this.magicAtt * ((100 - hero.magicDef) / 100);
        if (hero.health <= 0) {
            hero.health = 0;
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health = hero.health - this.physAtt * ((100 - hero.physDef) / 100);
        if (hero.health <= 0) {
            hero.health = 0;
        }
    }
}
