package net.yamanoboriold.designpattern.decorator.ramenshop;

public class Agitama extends Gu {

    private RamenNoZairyo zairyo;
    private final int COST = 100;

    public Agitama(RamenNoZairyo zairyo) {
        this.zairyo = zairyo;
    }

    public String getDescription() {
        return this.zairyo.getDescription() + " 味玉入り";
    }

    public int cost() {
        return this.zairyo.cost() + COST;
    }
}
