package day11.task2.game;

public abstract class Hero {
    protected double health;
    protected double physDef;
    protected double magicDef;
    protected double physAtt;
    protected double magicAtt;

    public double getHealth() {
        return health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public double getPhysAtt() {
        return physAtt;
    }

    public double getMagicAtt() {
        return magicAtt;
    }
}
