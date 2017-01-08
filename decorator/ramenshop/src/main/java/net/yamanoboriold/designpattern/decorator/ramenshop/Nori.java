package net.yamanoboriold.designpattern.decorator.ramenshop;

public class Nori extends Gu {

    private RamenNoZairyo zairyo;
    private static final int COST = 50;

    public Nori(RamenNoZairyo zairyo) {
        this.zairyo = zairyo;
    }

    public String getDescription() {
        return this.zairyo.getDescription() + " 海苔入り";
    }

    public int cost() {
        return this.zairyo.cost() + COST;
    }
}
